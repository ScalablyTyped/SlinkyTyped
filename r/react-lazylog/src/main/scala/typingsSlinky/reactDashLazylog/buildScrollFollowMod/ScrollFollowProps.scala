package typingsSlinky.reactDashLazylog.buildScrollFollowMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollFollowProps extends js.Object {
  var startFollowing: js.UndefOr[Boolean] = js.undefined
  def render(props: ScrollFollowRenderProps): TagMod[Any]
}

object ScrollFollowProps {
  @scala.inline
  def apply(render: ScrollFollowRenderProps => TagMod[Any], startFollowing: js.UndefOr[Boolean] = js.undefined): ScrollFollowProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (!js.isUndefined(startFollowing)) __obj.updateDynamic("startFollowing")(startFollowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollFollowProps]
  }
}

