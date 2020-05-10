package typingsSlinky.reactEditext.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdiTextProps extends js.Object {
  /**
    * Custom class name for CANCEL button.
    */
  var cancelButtonClassName: js.UndefOr[String] = js.native
  /**
    * Content for CANCEL button. Any valid element and node are allowed.
    */
  var cancelButtonContent: js.UndefOr[js.Any] = js.native
  /**
    * Custom class name for EDIT button.
    */
  var editButtonClassName: js.UndefOr[String] = js.native
  /**
    * Content for EDIT button. Any valid element and node are allowed.
    */
  var editButtonContent: js.UndefOr[js.Any] = js.native
  /**
    * Set it to `true` if you don't want to see default icons
    * on action buttons.See Examples page for more details.
    */
  var hideIcons: js.UndefOr[Boolean] = js.native
  /**
    * A simple hint message appears at the bottom of input element.
    * Any valid element is allowed.
    */
  var hint: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Props to be passed to input element.
    * Any kind of valid DOM attributes are welcome
    */
  var inputProps: js.UndefOr[js.Object] = js.native
  /**
    * will be called when user clicked cancel button
    */
  var onCancel: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  /**
    * will be called when validation fails.
    * takes one param <value> which is the current value of input
    */
  var onValidationFail: js.UndefOr[js.Function1[/* repeated */ String, _]] = js.native
  /**
    * Custom class name for SAVE button.
    */
  var saveButtonClassName: js.UndefOr[String] = js.native
  /**
    * Content for SAVE button. Any valid element and node are allowed.
    */
  var saveButtonContent: js.UndefOr[js.Any] = js.native
  /**
    * Input type. Possible options are:
    * `text`, `number`, `email`, `textarea`, `date`,
    * `datetime-local`, `time`, `month`, `url`, `week`, `tel`
    */
  var `type`: EdiTextType = js.native
  /**
    * Pass your own validation function.
    * takes one param -> `value`.
    * It must return `true` or `false`
    */
  var validation: js.UndefOr[js.Function1[/* repeated */ String, Boolean]] = js.native
  /**
    * If validation fails this message will appear
    */
  var validationMessage: js.UndefOr[String] = js.native
  /**
    * Value of the content [in view mode] and input [in edit mode]
    */
  var value: String = js.native
  /**
    * Props to be passed to div element that shows the text.
    * You can specify your own `styles` or `className`
    */
  var viewProps: js.UndefOr[js.Object] = js.native
  /**
    * will be called when user clicked save button.
    * takes one param <value> which is the current value of input
    */
  def onSave(args: String*): js.Any = js.native
}

object EdiTextProps {
  @scala.inline
  def apply(onSave: /* repeated */ String => js.Any, `type`: EdiTextType, value: String): EdiTextProps = {
    val __obj = js.Dynamic.literal(onSave = js.Any.fromFunction1(onSave), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdiTextProps]
  }
  @scala.inline
  implicit class EdiTextPropsOps[Self <: EdiTextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSave(value: /* repeated */ String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: EdiTextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonContent")(js.undefined)
        ret
    }
    @scala.inline
    def withEditButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEditButtonContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editButtonContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditButtonContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editButtonContent")(js.undefined)
        ret
    }
    @scala.inline
    def withHideIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withHintReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHint(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: js.Object): Self = {
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
    def withOnCancel(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidationFail(value: /* repeated */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidationFail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValidationFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidationFail")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveButtonContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveButtonContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveButtonContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveButtonContent")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: /* repeated */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withViewProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewProps")(js.undefined)
        ret
    }
  }
  
}

