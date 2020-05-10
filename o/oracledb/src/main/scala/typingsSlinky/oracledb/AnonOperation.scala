package typingsSlinky.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOperation extends js.Object {
  /** One of the CQN_OPCODE_* constants. */
  var operation: Double = js.native
  /** ROWID of the row that was affected. */
  var rowid: String = js.native
}

object AnonOperation {
  @scala.inline
  def apply(operation: Double, rowid: String): AnonOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], rowid = rowid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOperation]
  }
  @scala.inline
  implicit class AnonOperationOps[Self <: AnonOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

