package typingsSlinky.reactToolbox.hocPortalMod

import typingsSlinky.reactToolbox.libMod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalProps extends Props {
  var container: js.UndefOr[js.Any] = js.native
  var lockBody: js.UndefOr[Boolean] = js.native
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
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withLockBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockBody")(js.undefined)
        ret
    }
  }
  
}

