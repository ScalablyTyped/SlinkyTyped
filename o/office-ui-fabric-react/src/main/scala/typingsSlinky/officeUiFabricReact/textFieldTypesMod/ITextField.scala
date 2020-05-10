package typingsSlinky.officeUiFabricReact.textFieldTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextField extends js.Object {
  /** Gets the selection end of the text field. Returns -1 if there is no selection. */
  var selectionEnd: Double | Null = js.native
  /** Gets the selection start of the text field. Returns -1 if there is no selection. */
  var selectionStart: Double | Null = js.native
  /** Gets the current value of the input. */
  var value: js.UndefOr[String] = js.native
  /** Blurs the input */
  def blur(): Unit = js.native
  /** Sets focus to the input. */
  def focus(): Unit = js.native
  /** Select the value of the text field. */
  def select(): Unit = js.native
  /** Sets the selection end of the text field to a specified value. */
  def setSelectionEnd(value: Double): Unit = js.native
  /**
    * Sets the start and end positions of a selection in a text field.
    * Call with start and end set to the same value to set the cursor position.
    * @param start - Index of the start of the selection.
    * @param end - Index of the end of the selection.
    */
  def setSelectionRange(start: Double, end: Double): Unit = js.native
  /** Sets the selection start of the text field to a specified value. */
  def setSelectionStart(value: Double): Unit = js.native
}

object ITextField {
  @scala.inline
  def apply(
    blur: () => Unit,
    focus: () => Unit,
    select: () => Unit,
    setSelectionEnd: Double => Unit,
    setSelectionRange: (Double, Double) => Unit,
    setSelectionStart: Double => Unit
  ): ITextField = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), select = js.Any.fromFunction0(select), setSelectionEnd = js.Any.fromFunction1(setSelectionEnd), setSelectionRange = js.Any.fromFunction2(setSelectionRange), setSelectionStart = js.Any.fromFunction1(setSelectionStart))
    __obj.asInstanceOf[ITextField]
  }
  @scala.inline
  implicit class ITextFieldOps[Self <: ITextField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSelectionEnd(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelectionRange(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectionRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSelectionStart(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectionEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionEndNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(null)
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(null)
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

