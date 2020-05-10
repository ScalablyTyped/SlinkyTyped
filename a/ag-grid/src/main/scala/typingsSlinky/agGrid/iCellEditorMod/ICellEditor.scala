package typingsSlinky.agGrid.iCellEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellEditor extends js.Object {
  /** If doing full line edit, then gets called when focus should be put into the editor */
  var focusIn: js.UndefOr[js.Function0[Unit]] = js.native
  /** If doing full line edit, then gets called when focus is leaving the editor */
  var focusOut: js.UndefOr[js.Function0[Unit]] = js.native
  /** Gets called once after editing is complete. If your return true, then the new value will not be used. The
    *  editing will have no impact on the record. Use this if you do not want a new value from your gui, i.e. you
    *  want to cancel the editing. */
  var isCancelAfterEnd: js.UndefOr[js.Function0[Boolean]] = js.native
  /** Gets called once after initialised. If you return true, the editor will not be used and the grid will continue
    *  editing. Use this to make a decision on editing inside the init() function, eg maybe you want to only start
    *  editing if the user hits a numeric key, but not a letter, if the editor is for numbers.
    * */
  var isCancelBeforeStart: js.UndefOr[js.Function0[Boolean]] = js.native
  /** Gets called once after initialised. If you return true, the editor will appear in a popup, so is not constrained
    *  to the boundaries of the cell. This is great if you want to, for example, provide you own custom dropdown list
    *  for selection. Default is false (ie if you don't provide the method). */
  var isPopup: js.UndefOr[js.Function0[Boolean]] = js.native
  /** Return the final value - called by the grid once after editing is complete */
  def getValue(): js.Any = js.native
}

object ICellEditor {
  @scala.inline
  def apply(getValue: () => js.Any): ICellEditor = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[ICellEditor]
  }
  @scala.inline
  implicit class ICellEditorOps[Self <: ICellEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocusIn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFocusIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCancelAfterEnd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelAfterEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsCancelAfterEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelAfterEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCancelBeforeStart(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelBeforeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsCancelBeforeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelBeforeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPopup(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPopup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPopup")(js.undefined)
        ret
    }
  }
  
}

