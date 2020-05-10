package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowStateInstanceProps[D /* <: js.Object */] extends js.Object {
  def setCellState(rowPath: js.Array[String], columnId: IdType[D], updater: UseRowUpdater[_]): Unit = js.native
  def setRowState(rowPath: js.Array[String], updater: UseRowUpdater[_]): Unit = js.native
}

object UseRowStateInstanceProps {
  @scala.inline
  def apply[D](
    setCellState: (js.Array[String], IdType[D], UseRowUpdater[_]) => Unit,
    setRowState: (js.Array[String], UseRowUpdater[_]) => Unit
  ): UseRowStateInstanceProps[D] = {
    val __obj = js.Dynamic.literal(setCellState = js.Any.fromFunction3(setCellState), setRowState = js.Any.fromFunction2(setRowState))
    __obj.asInstanceOf[UseRowStateInstanceProps[D]]
  }
  @scala.inline
  implicit class UseRowStateInstancePropsOps[Self[d] <: UseRowStateInstanceProps[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withSetCellState(value: (js.Array[String], IdType[D], UseRowUpdater[_]) => Unit): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCellState")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetRowState(value: (js.Array[String], UseRowUpdater[_]) => Unit): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowState")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

