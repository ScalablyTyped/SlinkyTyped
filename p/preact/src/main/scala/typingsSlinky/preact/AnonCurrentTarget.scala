package typingsSlinky.preact

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentTarget[Target /* <: EventTarget */] extends js.Object {
  val currentTarget: Target = js.native
}

object AnonCurrentTarget {
  @scala.inline
  def apply[Target](currentTarget: Target): AnonCurrentTarget[Target] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentTarget[Target]]
  }
  @scala.inline
  implicit class AnonCurrentTargetOps[Self[target] <: AnonCurrentTarget[target], Target] (val x: Self[Target]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Target] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Target]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Target] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Target] with Other]
    @scala.inline
    def withCurrentTarget(value: Target): Self[Target] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

