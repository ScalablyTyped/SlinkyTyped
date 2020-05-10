package typingsSlinky.jupyterlabConsole.foreignMod.ForeignHandler

import typingsSlinky.jupyterlabCells.mod.CodeCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A receiver of newly created foreign cells.
  */
@js.native
trait IReceiver extends js.Object {
  /**
    * Add a newly created cell.
    */
  def addCell(cell: CodeCell, msgId: String): Unit = js.native
  /**
    * Create a cell.
    */
  def createCodeCell(): CodeCell = js.native
  /**
    * Get a cell associated with a message id.
    */
  def getCell(msgId: String): CodeCell = js.native
  /**
    * Trigger a rendering update on the receiver.
    */
  def update(): Unit = js.native
}

object IReceiver {
  @scala.inline
  def apply(
    addCell: (CodeCell, String) => Unit,
    createCodeCell: () => CodeCell,
    getCell: String => CodeCell,
    update: () => Unit
  ): IReceiver = {
    val __obj = js.Dynamic.literal(addCell = js.Any.fromFunction2(addCell), createCodeCell = js.Any.fromFunction0(createCodeCell), getCell = js.Any.fromFunction1(getCell), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[IReceiver]
  }
  @scala.inline
  implicit class IReceiverOps[Self <: IReceiver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCell(value: (CodeCell, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateCodeCell(value: () => CodeCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCodeCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCell(value: String => CodeCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

