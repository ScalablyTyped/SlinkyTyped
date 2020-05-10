package typingsSlinky.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelection extends js.Object {
  /**
    * The column on `positionLineNumber` where the selection has ended.
    */
  val positionColumn: Double = js.native
  /**
    * The line number on which the selection has ended.
    */
  val positionLineNumber: Double = js.native
  /**
    * The column on `selectionStartLineNumber` where the selection has started.
    */
  val selectionStartColumn: Double = js.native
  /**
    * The line number on which the selection has started.
    */
  val selectionStartLineNumber: Double = js.native
}

object ISelection {
  @scala.inline
  def apply(
    positionColumn: Double,
    positionLineNumber: Double,
    selectionStartColumn: Double,
    selectionStartLineNumber: Double
  ): ISelection = {
    val __obj = js.Dynamic.literal(positionColumn = positionColumn.asInstanceOf[js.Any], positionLineNumber = positionLineNumber.asInstanceOf[js.Any], selectionStartColumn = selectionStartColumn.asInstanceOf[js.Any], selectionStartLineNumber = selectionStartLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelection]
  }
  @scala.inline
  implicit class ISelectionOps[Self <: ISelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPositionColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStartColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStartLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStartLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

