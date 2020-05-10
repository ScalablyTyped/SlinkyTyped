package typingsSlinky.reactOverlays.waitForContainerMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitForContainerProps extends js.Object {
  /**
    * "offsetParent" of the component
    */
  var container: js.UndefOr[TagMod[Any] | js.Function] = js.native
  var onContainerResolved: js.UndefOr[js.Function] = js.native
}

object WaitForContainerProps {
  @scala.inline
  def apply(): WaitForContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForContainerProps]
  }
  @scala.inline
  implicit class WaitForContainerPropsOps[Self <: WaitForContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: TagMod[Any] | js.Function): Self = {
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
    def withOnContainerResolved(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContainerResolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnContainerResolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContainerResolved")(js.undefined)
        ret
    }
  }
  
}

