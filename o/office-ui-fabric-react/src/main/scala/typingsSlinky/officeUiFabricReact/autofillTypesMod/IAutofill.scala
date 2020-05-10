package typingsSlinky.officeUiFabricReact.autofillTypesMod

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutofill extends js.Object {
  /**
    * The current index of the cursor in the input area. Returns -1 if the input element
    * is not ready.
    */
  var cursorLocation: Double | Null = js.native
  /**
    * The current input element.
    */
  var inputElement: HTMLInputElement | Null = js.native
  /**
    * A boolean for whether or not there is a value selected in the input area.
    */
  var isValueSelected: Boolean = js.native
  /**
    * the current index of where the selection ends. Returns -1 if the input element
    * is not ready.
    */
  var selectionEnd: Double | Null = js.native
  /**
    * The current index of where the selection starts. Returns -1 if the input element
    * is not ready.
    */
  var selectionStart: Double | Null = js.native
  /**
    * The current text value that the user has entered.
    */
  var value: String = js.native
  /**
    * Clear all text in the input. Sets value to '';
    */
  def clear(): Unit = js.native
  /**
    * Focus the input element.
    */
  def focus(): Unit = js.native
}

object IAutofill {
  @scala.inline
  def apply(clear: () => Unit, focus: () => Unit, isValueSelected: Boolean, value: String): IAutofill = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), focus = js.Any.fromFunction0(focus), isValueSelected = isValueSelected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutofill]
  }
  @scala.inline
  implicit class IAutofillOps[Self <: IAutofill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValueSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValueSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorLocationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLocation")(null)
        ret
    }
    @scala.inline
    def withInputElement(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputElement")(null)
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
  }
  
}

