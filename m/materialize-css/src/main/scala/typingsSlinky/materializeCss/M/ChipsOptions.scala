package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.anon.PartialAutocompleteOptionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChipsOptions extends js.Object {
  /**
    * Set autocomplete options
    * @default {}
    */
  var autocompleteOptions: PartialAutocompleteOptionData = js.native
  /**
    * Set the chip data
    * @default []
    */
  var data: js.Array[ChipData] = js.native
  /**
    * Set chips limit
    * @default Infinity
    */
  var limit: Double = js.native
  /**
    * Set first placeholder when there are no tags
    * @default ''
    */
  var placeholder: String = js.native
  /**
    * Set second placeholder when adding additional tags
    * @default ''
    */
  var secondaryPlaceholder: String = js.native
  /**
    * Callback for chip add
    * @default null
    */
  def onChipAdd(element: Element, chip: Element): Unit = js.native
  /**
    * Callback for chip delete
    * @default null
    */
  def onChipDelete(element: Element, chip: Element): Unit = js.native
  /**
    * Callback for chip select
    * @default null
    */
  def onChipSelect(element: Element, chip: Element): Unit = js.native
}

object ChipsOptions {
  @scala.inline
  def apply(
    autocompleteOptions: PartialAutocompleteOptionData,
    data: js.Array[ChipData],
    limit: Double,
    onChipAdd: (Element, Element) => Unit,
    onChipDelete: (Element, Element) => Unit,
    onChipSelect: (Element, Element) => Unit,
    placeholder: String,
    secondaryPlaceholder: String
  ): ChipsOptions = {
    val __obj = js.Dynamic.literal(autocompleteOptions = autocompleteOptions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], onChipAdd = js.Any.fromFunction2(onChipAdd), onChipDelete = js.Any.fromFunction2(onChipDelete), onChipSelect = js.Any.fromFunction2(onChipSelect), placeholder = placeholder.asInstanceOf[js.Any], secondaryPlaceholder = secondaryPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipsOptions]
  }
  @scala.inline
  implicit class ChipsOptionsOps[Self <: ChipsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocompleteOptions(value: PartialAutocompleteOptionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocompleteOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[ChipData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChipAdd(value: (Element, Element) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnChipDelete(value: (Element, Element) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipDelete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnChipSelect(value: (Element, Element) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

