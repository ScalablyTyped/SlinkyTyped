package typingsSlinky.gatsby.mod

import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageRendererProps extends js.Object {
  var location: WindowLocation[LocationState] = js.native
}

object PageRendererProps {
  @scala.inline
  def apply(location: WindowLocation[LocationState]): PageRendererProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageRendererProps]
  }
  @scala.inline
  implicit class PageRendererPropsOps[Self <: PageRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: WindowLocation[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

