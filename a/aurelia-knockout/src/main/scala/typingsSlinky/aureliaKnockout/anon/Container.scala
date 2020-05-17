package typingsSlinky.aureliaKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var container: typingsSlinky.aureliaDependencyInjection.mod.Container = js.native
  def globalResources(resources: String*): js.Any = js.native
}

object Container {
  @scala.inline
  def apply(
    container: typingsSlinky.aureliaDependencyInjection.mod.Container,
    globalResources: /* repeated */ String => js.Any
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], globalResources = js.Any.fromFunction1(globalResources))
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: typingsSlinky.aureliaDependencyInjection.mod.Container): Self = {
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

