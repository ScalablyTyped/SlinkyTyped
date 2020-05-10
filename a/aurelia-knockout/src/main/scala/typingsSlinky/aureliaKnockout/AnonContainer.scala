package typingsSlinky.aureliaKnockout

import typingsSlinky.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainer extends js.Object {
  var container: Container = js.native
  def globalResources(resources: String*): js.Any = js.native
}

object AnonContainer {
  @scala.inline
  def apply(container: Container, globalResources: /* repeated */ String => js.Any): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], globalResources = js.Any.fromFunction1(globalResources))
    __obj.asInstanceOf[AnonContainer]
  }
  @scala.inline
  implicit class AnonContainerOps[Self <: AnonContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: Container): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalResources(value: /* repeated */ String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalResources")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

