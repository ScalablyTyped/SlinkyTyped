package typingsSlinky.reachWindowSize.mod

import slinky.core.TagMod
import typingsSlinky.reachWindowSize.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeProps extends js.Object {
  def children(size: AnonHeight): TagMod[Any]
}

object WindowSizeProps {
  @scala.inline
  def apply(children: AnonHeight => TagMod[Any]): WindowSizeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[WindowSizeProps]
  }
}

