package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.ChipData
import typingsSlinky.materializeCss.M.Chips
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ChipsOptions> */
@js.native
trait PartialChipsOptionsAutocompleteOptions extends js.Object {
  var autocompleteOptions: js.UndefOr[PartialAutocompleteOptionData] = js.native
  var data: js.UndefOr[js.Array[ChipData]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var onChipAdd: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.native
  var onChipDelete: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.native
  var onChipSelect: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var secondaryPlaceholder: js.UndefOr[String] = js.native
}

object PartialChipsOptionsAutocompleteOptions {
  @scala.inline
  def apply(): PartialChipsOptionsAutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChipsOptionsAutocompleteOptions]
  }
  @scala.inline
  implicit class PartialChipsOptionsAutocompleteOptionsOps[Self <: PartialChipsOptionsAutocompleteOptions] (val x: Self) extends AnyVal {
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
    def withoutAutocompleteOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocompleteOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[ChipData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChipAdd(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChipAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChipDelete(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChipDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChipSelect(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChipSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChipSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryPlaceholder")(js.undefined)
        ret
    }
  }
  
}

