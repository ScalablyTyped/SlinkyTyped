package typingsSlinky.baseui.headingMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingLevelProps extends js.Object {
  var children: TagMod[Any]
}

object HeadingLevelProps {
  @scala.inline
  def apply(children: TagMod[Any]): HeadingLevelProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeadingLevelProps]
  }
}

