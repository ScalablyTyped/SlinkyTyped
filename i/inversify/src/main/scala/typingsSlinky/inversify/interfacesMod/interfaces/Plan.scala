package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plan extends js.Object {
  var parentContext: Context = js.native
  var rootRequest: Request = js.native
}

object Plan {
  @scala.inline
  def apply(parentContext: Context, rootRequest: Request): Plan = {
    val __obj = js.Dynamic.literal(parentContext = parentContext.asInstanceOf[js.Any], rootRequest = rootRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  @scala.inline
  implicit class PlanOps[Self <: Plan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootRequest(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

