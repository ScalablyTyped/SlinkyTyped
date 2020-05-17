package typingsSlinky.elasticApmNode.anon

import typingsSlinky.elasticApmNode.mod.Connect.ErrorHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connect extends js.Object {
  def connect(): ErrorHandleFunction = js.native
}

object Connect {
  @scala.inline
  def apply(connect: () => ErrorHandleFunction): Connect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect))
    __obj.asInstanceOf[Connect]
  }
  @scala.inline
  implicit class ConnectOps[Self <: Connect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: () => ErrorHandleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

