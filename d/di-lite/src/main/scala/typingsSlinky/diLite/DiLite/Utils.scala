package typingsSlinky.diLite.DiLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  def invokeStmt(args: js.Any, op: String): String = js.native
}

object Utils {
  @scala.inline
  def apply(invokeStmt: (js.Any, String) => String): Utils = {
    val __obj = js.Dynamic.literal(invokeStmt = js.Any.fromFunction2(invokeStmt))
    __obj.asInstanceOf[Utils]
  }
  @scala.inline
  implicit class UtilsOps[Self <: Utils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvokeStmt(value: (js.Any, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeStmt")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

