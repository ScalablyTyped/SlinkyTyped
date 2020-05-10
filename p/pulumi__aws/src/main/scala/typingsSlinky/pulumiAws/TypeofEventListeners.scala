package typingsSlinky.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofEventListeners extends js.Object {
  val Core: TypeofCore = js.native
}

object TypeofEventListeners {
  @scala.inline
  def apply(Core: TypeofCore): TypeofEventListeners = {
    val __obj = js.Dynamic.literal(Core = Core.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEventListeners]
  }
  @scala.inline
  implicit class TypeofEventListenersOps[Self <: TypeofEventListeners] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCore(value: TypeofCore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Core")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

