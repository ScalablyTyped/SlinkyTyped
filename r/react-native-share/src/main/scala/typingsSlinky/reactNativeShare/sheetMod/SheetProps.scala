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
  def apply(visible: Boolean, children: TagMod[Any] = null): SheetProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetProps]
  }
}

