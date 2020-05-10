package typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection owner.
  */
@js.native
trait ISelectionOwner extends js.Object {
  /**
    * The uuid of this selection owner.
    */
  var uuid: String = js.native
  /**
    * Returns the primary position of the cursor, never `null`.
    */
  def getCursorPosition(): IPosition = js.native
  /**
    * Returns the primary selection, never `null`.
    */
  def getSelection(): IRange = js.native
  /**
    * Gets the selections for all the cursors, never `null` or empty.
    */
  def getSelections(): js.Array[IRange] = js.native
  /**
    * Set the primary position of the cursor.
    *
    * @param position - The new primary position.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setCursorPosition(position: IPosition): Unit = js.native
  /**
    * Set the primary selection.
    *
    * @param selection - The desired selection range.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setSelection(selection: IRange): Unit = js.native
  /**
    * Sets the selections for all the cursors.
    *
    * @param selections - The new selections.
    *
    * #### Notes
    * Cursors will be removed or added, as necessary.
    * Passing an empty array resets a cursor position to the start of a
    * document.
    */
  def setSelections(selections: js.Array[IRange]): Unit = js.native
}

object ISelectionOwner {
  @scala.inline
  def apply(
    getCursorPosition: () => IPosition,
    getSelection: () => IRange,
    getSelections: () => js.Array[IRange],
    setCursorPosition: IPosition => Unit,
    setSelection: IRange => Unit,
    setSelections: js.Array[IRange] => Unit,
    uuid: String
  ): ISelectionOwner = {
    val __obj = js.Dynamic.literal(getCursorPosition = js.Any.fromFunction0(getCursorPosition), getSelection = js.Any.fromFunction0(getSelection), getSelections = js.Any.fromFunction0(getSelections), setCursorPosition = js.Any.fromFunction1(setCursorPosition), setSelection = js.Any.fromFunction1(setSelection), setSelections = js.Any.fromFunction1(setSelections), uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionOwner]
  }
  @scala.inline
  implicit class ISelectionOwnerOps[Self <: ISelectionOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCursorPosition(value: () => IPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCursorPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelection(value: () => IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelections(value: () => js.Array[IRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCursorPosition(value: IPosition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCursorPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelection(value: IRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelections(value: js.Array[IRange] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelections")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

