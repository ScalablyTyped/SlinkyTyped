package typingsSlinky.blueprintjsCore.fileInputMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLabelElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.LabelHTMLAttributes
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IFileInputProps extends LabelHTMLAttributes[HTMLLabelElement] {
  /**
    * The button text.
    * @default "Browse"
    */
  var buttonText: js.UndefOr[String] = js.native
  /**
    * Whether the file input is non-interactive.
    * Setting this to `true` will automatically disable the child input too.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the file input should take up the full width of its container.
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user has made a selection in the input. This will affect the component's
    * text styling. Make sure to set a non-empty value for the text prop as well.
    * @default false
    */
  var hasSelection: js.UndefOr[Boolean] = js.native
  /**
    * The props to pass to the child input.
    * `disabled` will be ignored in favor of the top-level prop.
    * `type` will be ignored, because the input _must_ be `type="file"`.
    * Pass `onChange` here to be notified when the user selects a file.
    */
  var inputProps: js.UndefOr[HTMLProps[HTMLInputElement]] = js.native
  /**
    * Whether the file input should appear with large styling.
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * Callback invoked on `<input>` `change` events.
    *
    * This callback is offered as a convenience; it is equivalent to passing
    * `onChange` to `inputProps`.
    *
    * __Note:__ The top-level `onChange` prop is passed to the wrapping
    * `<label>` rather than the `<input>`, which may not be what you expect.
    */
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  /**
    * The text to display.
    * @default "Choose file..."
    */
  var text: js.UndefOr[TagMod[Any]] = js.native
}

object IFileInputProps {
  @scala.inline
  def apply(): IFileInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileInputProps]
  }
  @scala.inline
  implicit class IFileInputPropsOps[Self <: IFileInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: HTMLProps[HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInputChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.undefined)
        ret
    }
    @scala.inline
    def withTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

