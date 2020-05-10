package typingsSlinky.fluxible.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluxibleConfiguration extends js.Object {
  /**
    * Stores your top level React component for access using `getComponent()`
    */
  var component: js.Any = js.native
  /**
    * App level component action handler
    */
  var componentActionHandler: js.UndefOr[js.Function0[Unit]] = js.native
}

object FluxibleConfiguration {
  @scala.inline
  def apply(component: js.Any): FluxibleConfiguration = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxibleConfiguration]
  }
  @scala.inline
  implicit class FluxibleConfigurationOps[Self <: FluxibleConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentActionHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentActionHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentActionHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentActionHandler")(js.undefined)
        ret
    }
  }
  
}

