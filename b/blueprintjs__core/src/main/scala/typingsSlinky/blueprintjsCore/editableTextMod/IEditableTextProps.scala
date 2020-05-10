package typingsSlinky.blueprintjsCore.editableTextMod

import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableTextProps
  extends IIntentProps
     with IProps {
  /**
    * EXPERIMENTAL FEATURE.
    *
    * When true, this forces the component to _always_ render an editable input (or textarea)
    * both when the component is focussed and unfocussed, instead of the component's default
    * behavior of switching between a text span and a text input upon interaction.
    *
    * This behavior can help in certain applications where, for example, a custom right-click
    * context menu is used to supply clipboard copy and paste functionality.
    * @default false
    */
  var alwaysRenderInput: js.UndefOr[Boolean] = js.native
  /**
    * If `true` and in multiline mode, the `enter` key will trigger onConfirm and `mod+enter`
    * will insert a newline. If `false`, the key bindings are inverted such that `enter`
    * adds a newline.
    * @default false
    */
  var confirmOnEnterKey: js.UndefOr[Boolean] = js.native
  /** Default text value of uncontrolled input. */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * Whether the text can be edited.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Whether the component is currently being edited. */
  var isEditing: js.UndefOr[Boolean] = js.native
  /** Maximum number of characters allowed. Unlimited by default. */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * Maximum number of lines before scrolling begins, when `multiline`.
    */
  var maxLines: js.UndefOr[Double] = js.native
  /**
    * Minimum number of lines (essentially minimum height), when `multiline`.
    * @default 1
    */
  var minLines: js.UndefOr[Double] = js.native
  /** Minimum width in pixels of the input, when not `multiline`. */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Whether the component supports multiple lines of text.
    * This prop should not be changed during the component's lifetime.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.native
  /** Callback invoked when user cancels input with the `esc` key. Receives last confirmed value. */
  var onCancel: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /** Callback invoked when user changes input in any way. */
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /** Callback invoked when user confirms value with `enter` key or by blurring input. */
  var onConfirm: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /** Callback invoked after the user enters edit mode. */
  var onEdit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /**
    * Placeholder text when there is no value.
    * @default "Click to Edit"
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Whether the entire text field should be selected on focus.
    * If `false`, the cursor is placed at the end of the text.
    * This prop is ignored on inputs with type other then text, search, url, tel and password. See https://html.spec.whatwg.org/multipage/input.html#do-not-apply for details.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * The type of input that should be shown, when not `multiline`.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Text value of controlled input. */
  var value: js.UndefOr[String] = js.native
}

object IEditableTextProps {
  @scala.inline
  def apply(): IEditableTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableTextProps]
  }
  @scala.inline
  implicit class IEditableTextPropsOps[Self <: IEditableTextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysRenderInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRenderInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysRenderInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRenderInput")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmOnEnterKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmOnEnterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmOnEnterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmOnEnterKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
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
    def withIsEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: /* value */ String => Unit): Self = {
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
    def withOnChange(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConfirm(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEdit(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdit")(js.undefined)
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
    def withSelectAllOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

