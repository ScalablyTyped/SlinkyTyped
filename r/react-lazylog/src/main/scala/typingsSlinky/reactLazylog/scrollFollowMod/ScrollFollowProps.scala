package typingsSlinky.reactLazylog.scrollFollowMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollFollowProps extends js.Object {
  var startFollowing: js.UndefOr[Boolean] = js.native
  def render(props: ScrollFollowRenderProps): TagMod[Any] = js.native
}

object ScrollFollowProps {
  @scala.inline
  def apply(render: ScrollFollowRenderProps => TagMod[Any]): ScrollFollowProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[ScrollFollowProps]
  }
  @scala.inline
  implicit class ScrollFollowPropsOps[Self <: ScrollFollowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: ScrollFollowRenderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartFollowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFollowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartFollowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFollowing")(js.undefined)
        ret
    }
  }
  
}

