package typingsSlinky.reachRouter.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationProps extends js.Object {
  var children: LocationProviderRenderFn
}

object LocationProps {
  @scala.inline
  def apply(children: /* context */ LocationContext => TagMod[Any]): LocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[LocationProps]
  }
}

