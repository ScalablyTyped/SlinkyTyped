package typingsSlinky.conductorDashAnimate.conductorDashAnimateMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedProps extends js.Object {
  var additional: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[TagMod[Any] | ReactNodeArray | Null] = js.undefined
  var id: String
}

object AnimatedProps {
  @scala.inline
  def apply(id: String, additional: js.Object = null, children: TagMod[Any] | ReactNodeArray = null): AnimatedProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (additional != null) __obj.updateDynamic("additional")(additional.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedProps]
  }
}

