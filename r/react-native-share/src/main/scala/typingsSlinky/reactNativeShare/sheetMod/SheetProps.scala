package typingsSlinky.reactNativeShare.sheetMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetProps extends js.Object {
  var children: TagMod[Any]
  var visible: Boolean
}

object SheetProps {
  @scala.inline
  def apply(children: TagMod[Any], visible: Boolean): SheetProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetProps]
  }
}

