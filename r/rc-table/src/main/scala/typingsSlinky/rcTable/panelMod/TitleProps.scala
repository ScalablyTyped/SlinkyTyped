package typingsSlinky.rcTable.panelMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleProps extends js.Object {
  var children: TagMod[Any]
  var className: String
}

object TitleProps {
  @scala.inline
  def apply(children: TagMod[Any], className: String): TitleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TitleProps]
  }
}

