package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var container: Container = js.native
  var currentRequest: Request = js.native
  var id: Double = js.native
  var plan: Plan = js.native
  def addPlan(plan: Plan): Unit = js.native
  def setCurrentRequest(request: Request): Unit = js.native
}

object Context {
  @scala.inline
  def apply(
    addPlan: Plan => Unit,
    container: Container,
    currentRequest: Request,
    id: Double,
    plan: Plan,
    setCurrentRequest: Request => Unit
  ): Context = {
    val __obj = js.Dynamic.literal(addPlan = js.Any.fromFunction1(addPlan), container = container.asInstanceOf[js.Any], currentRequest = currentRequest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setCurrentRequest = js.Any.fromFunction1(setCurrentRequest))
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPlan(value: Plan => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPlan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainer(value: Container): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentRequest(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: Plan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCurrentRequest(value: Request => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentRequest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

