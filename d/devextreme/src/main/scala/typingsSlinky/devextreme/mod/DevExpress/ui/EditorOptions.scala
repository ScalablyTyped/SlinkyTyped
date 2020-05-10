package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonJQueryEvent
import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.invalid
import typingsSlinky.devextreme.devextremeStrings.pending
import typingsSlinky.devextreme.devextremeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorOptions[T] extends WidgetOptions[T] {
  /** Specifies or indicates whether the editor's value is valid. */
  var isValid: js.UndefOr[Boolean] = js.native
  /** A function that is executed after the widget's value is changed. */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ AnonJQueryEvent[T], _]] = js.native
  /** Specifies whether the editor is read-only. */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Information on the broken validation rule. Contains the first item from the validationErrors array. */
  var validationError: js.UndefOr[js.Any] = js.native
  /** An array of the validation rules that failed. */
  var validationErrors: js.UndefOr[js.Array[_]] = js.native
  /** Specifies how the message about the validation rules that are not satisfied by this editor's value is displayed. */
  var validationMessageMode: js.UndefOr[always | auto] = js.native
  /** Indicates or specifies the current validation status. */
  var validationStatus: js.UndefOr[valid | invalid | pending] = js.native
  /** Specifies the widget's value. */
  var value: js.UndefOr[js.Any] = js.native
}

object EditorOptions {
  @scala.inline
  def apply[T](): EditorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorOptions[T]]
  }
  @scala.inline
  implicit class EditorOptionsOps[Self[t] <: EditorOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsValid(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsValid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* e */ AnonJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationError(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationError")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationErrors(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationErrors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMessageMode(value: always | auto): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessageMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessageMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessageMode")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationStatus(value: valid | invalid | pending): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationStatus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

