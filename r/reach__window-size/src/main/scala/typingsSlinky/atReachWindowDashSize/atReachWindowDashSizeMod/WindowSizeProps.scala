package typingsSlinky.atReachWindowDashSize.atReachWindowDashSizeMod

import slinky.core.TagMod
import typingsSlinky.atReachWindowDashSize.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeProps extends js.Object {
  def children(size: Anon_Height): TagMod[Any]
}

object WindowSizeProps {
  @scala.inline
  def apply(children: Anon_Height => TagMod[Any]): WindowSizeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[WindowSizeProps]
  }
}

