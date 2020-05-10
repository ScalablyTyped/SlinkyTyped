package typingsSlinky.mediumEditor.MediumEditor

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Document_
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreOptions extends js.Object {
  var activeButtonClass: js.UndefOr[String] = js.native
  var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.native
  var anchor: js.UndefOr[AnchorFormOptions] = js.native
  var anchorPreview: js.UndefOr[AnchorPreviewOptions | Boolean] = js.native
  var autoLink: js.UndefOr[Boolean] = js.native
  var buttonLabels: js.UndefOr[String | Boolean] = js.native
  var contentWindow: js.UndefOr[Window_] = js.native
  var delay: js.UndefOr[Double] = js.native
  var disableDoubleReturn: js.UndefOr[Boolean] = js.native
  var disableEditing: js.UndefOr[Boolean] = js.native
  var disableExtraSpaces: js.UndefOr[Boolean] = js.native
  var disableReturn: js.UndefOr[Boolean] = js.native
  var elementsContainer: js.UndefOr[HTMLElement] = js.native
  var extensions: js.UndefOr[js.Any] = js.native
  var imageDragging: js.UndefOr[Boolean] = js.native
  var keyboardCommands: js.UndefOr[KeyboardCommandsOptions | Boolean] = js.native
  var ownerDocument: js.UndefOr[Document_] = js.native
  var paste: js.UndefOr[PasteOptions] = js.native
  var placeholder: js.UndefOr[PlaceholderOptions | Boolean] = js.native
  var spellcheck: js.UndefOr[Boolean] = js.native
  var targetBlank: js.UndefOr[Boolean] = js.native
  var toolbar: js.UndefOr[ToolbarOptions | Boolean] = js.native
}

object CoreOptions {
  @scala.inline
  def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  @scala.inline
  implicit class CoreOptionsOps[Self <: CoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveButtonClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeButtonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveButtonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeButtonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiParagraphSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiParagraphSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiParagraphSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiParagraphSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchor(value: AnchorFormOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorPreview(value: AnchorPreviewOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLink")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLabels(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withContentWindow(value: Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDoubleReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDoubleReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableExtraSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExtraSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableExtraSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExtraSpaces")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withElementsContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardCommands(value: KeyboardCommandsOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerDocument(value: Document_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: PasteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: PlaceholderOptions | Boolean): Self = {
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
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetBlank")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: ToolbarOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
  }
  
}

