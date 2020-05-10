package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalBodyInterface[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * The required getFieldValue method that must be implemented on a customized insert modal body that returns the
  	 * new row data when the save button is clicked in the modal window.
  	 */
  def getFieldValue(): TRow = js.native
}

object ModalBodyInterface {
  @scala.inline
  def apply[TRow](getFieldValue: () => TRow): ModalBodyInterface[TRow] = {
    val __obj = js.Dynamic.literal(getFieldValue = js.Any.fromFunction0(getFieldValue))
    __obj.asInstanceOf[ModalBodyInterface[TRow]]
  }
  @scala.inline
  implicit class ModalBodyInterfaceOps[Self[trow] <: ModalBodyInterface[trow], TRow] (val x: Self[TRow]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TRow] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TRow] with Other]
    @scala.inline
    def withGetFieldValue(value: () => TRow): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

