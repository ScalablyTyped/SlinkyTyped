package typingsSlinky.antDesignReactNative.portalConsumerMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.portalHostMod.PortalMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalConsumerProps extends js.Object {
  var children: TagMod[Any] = js.native
  var manager: PortalMethods = js.native
}

object PortalConsumerProps {
  @scala.inline
  def apply(manager: PortalMethods): PortalConsumerProps = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalConsumerProps]
  }
  @scala.inline
  implicit class PortalConsumerPropsOps[Self <: PortalConsumerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManager(value: PortalMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

