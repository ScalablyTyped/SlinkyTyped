package typingsSlinky.rangy

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangyClassApplierOptions extends js.Object {
  var applyToEditableOnly: js.UndefOr[Boolean] = js.native
  var elementAttributes: js.UndefOr[StringDictionary[String]] = js.native
  var elementProperties: js.UndefOr[StringDictionary[String]] = js.native
  var elementTagName: js.UndefOr[String] = js.native
  var ignoreWhiteSpace: js.UndefOr[Boolean] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var onElementCreate: js.UndefOr[js.Function2[/* element */ Element, /* classApplier */ RangyClassApplier, Unit]] = js.native
  var tagNames: js.UndefOr[String | js.Array[String]] = js.native
  var useExistingElements: js.UndefOr[Boolean] = js.native
}

object RangyClassApplierOptions {
  @scala.inline
  def apply(): RangyClassApplierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangyClassApplierOptions]
  }
  @scala.inline
  implicit class RangyClassApplierOptionsOps[Self <: RangyClassApplierOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyToEditableOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToEditableOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyToEditableOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToEditableOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withElementAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withElementProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withElementTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementTagName")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreWhiteSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhiteSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWhiteSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhiteSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnElementCreate(value: (/* element */ Element, /* classApplier */ RangyClassApplier) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElementCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnElementCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElementCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withTagNames(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNames")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExistingElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExistingElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExistingElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExistingElements")(js.undefined)
        ret
    }
  }
  
}

