package typingsSlinky.reactOverlays.portalMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalProps extends js.Object {
  var container: js.UndefOr[ReactElement | js.Function] = js.native
  var onRendered: js.UndefOr[js.Function] = js.native
}

object PortalProps {
  @scala.inline
  def apply(): PortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalProps]
  }
  @scala.inline
  implicit class PortalPropsOps[Self <: PortalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainerReactElement(value: ReactElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: ReactElement | js.Function): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setOnRendered(value: js.Function): Self = this.set("onRendered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRendered: Self = this.set("onRendered", js.undefined)
  }
  
}

