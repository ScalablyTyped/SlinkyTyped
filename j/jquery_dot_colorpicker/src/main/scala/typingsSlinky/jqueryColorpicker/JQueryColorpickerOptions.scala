package typingsSlinky.jqueryColorpicker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryColorpickerOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.native
  var altAlpha: js.UndefOr[Boolean] = js.native
  var altField: js.UndefOr[String] = js.native
  var altOnChange: js.UndefOr[Boolean] = js.native
  var altProperties: js.UndefOr[String] = js.native
  var autoOpen: js.UndefOr[Boolean] = js.native
  var buttonClass: js.UndefOr[String] = js.native
  var buttonColorize: js.UndefOr[Boolean] = js.native
  var buttonImage: js.UndefOr[String] = js.native
  var buttonImageOnly: js.UndefOr[Boolean] = js.native
  var buttonText: js.UndefOr[String] = js.native
  // Events
  // TODO: Figure out actual types.
  var cancel: js.UndefOr[js.Function] = js.native
  var close: js.UndefOr[js.Function] = js.native
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  var closeOnOutside: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var colorFormat: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var hsv: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[js.Function] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inlineFrame: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[StringDictionary[js.Array[Double]]] = js.native
  var limit: js.UndefOr[String] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
  var ok: js.UndefOr[js.Function] = js.native
  var okOnEnter: js.UndefOr[Boolean] = js.native
  var open: js.UndefOr[js.Function] = js.native
  var part: js.UndefOr[js.Any] = js.native
  var parts: js.UndefOr[js.Any] = js.native
  var regional: js.UndefOr[String] = js.native
  var revert: js.UndefOr[Boolean] = js.native
  var rgb: js.UndefOr[Boolean] = js.native
  var select: js.UndefOr[js.Function] = js.native
  var showAnim: js.UndefOr[String] = js.native
  var showCancelButton: js.UndefOr[Boolean] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var showNoneButton: js.UndefOr[Boolean] = js.native
  var showOn: js.UndefOr[String] = js.native
  var showOptions: js.UndefOr[js.Any] = js.native
  var swatches: js.UndefOr[js.Any] = js.native
  var swatchesWidth: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
}

object JQueryColorpickerOptions {
  @scala.inline
  def apply(): JQueryColorpickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryColorpickerOptions]
  }
  @scala.inline
  implicit class JQueryColorpickerOptionsOps[Self <: JQueryColorpickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAltAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAltField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altField")(js.undefined)
        ret
    }
    @scala.inline
    def withAltOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAltProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonColorize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonColorize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonColorize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonColorize")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonImage")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonImageOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonImageOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonImageOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonImageOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withHsv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: StringDictionary[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: String): Self = {
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
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOk(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(js.undefined)
        ret
    }
    @scala.inline
    def withOkOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(js.undefined)
        ret
    }
    @scala.inline
    def withParts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRevert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.undefined)
        ret
    }
    @scala.inline
    def withRgb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAnim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAnim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnim")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancelButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNoneButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNoneButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNoneButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNoneButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSwatches(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatches")(js.undefined)
        ret
    }
    @scala.inline
    def withSwatchesWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatchesWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwatchesWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatchesWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

