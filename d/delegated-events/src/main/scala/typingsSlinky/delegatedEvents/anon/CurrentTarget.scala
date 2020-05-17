package typingsSlinky.delegatedEvents.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentTarget extends js.Object {
  var currentTarget: Element = js.native
}

object CurrentTarget {
  @scala.inline
  def apply(currentTarget: Element): CurrentTarget = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTarget]
  }
  @scala.inline
  implicit class CurrentTargetOps[Self <: CurrentTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

