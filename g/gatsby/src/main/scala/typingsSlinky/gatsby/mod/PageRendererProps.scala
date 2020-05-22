package typingsSlinky.gatsby.mod

import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRendererProps extends js.Object {
  var location: WindowLocation[LocationState]
}

object PageRendererProps {
  @scala.inline
  def apply(location: WindowLocation[LocationState]): PageRendererProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageRendererProps]
  }
}

