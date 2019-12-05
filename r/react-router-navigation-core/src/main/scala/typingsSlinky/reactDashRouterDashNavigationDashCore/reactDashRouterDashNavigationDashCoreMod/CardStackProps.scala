package typingsSlinky.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStackProps extends js.Object {
  var children: js.UndefOr[js.Array[TagMod[Any]]] = js.undefined
  def render(props: CardsRendererProps): TagMod[Any]
}

object CardStackProps {
  @scala.inline
  def apply(render: CardsRendererProps => TagMod[Any], children: js.Array[TagMod[Any]] = null): CardStackProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardStackProps]
  }
}

