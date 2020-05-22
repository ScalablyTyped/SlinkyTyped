package typingsSlinky.rcTable.footerMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps[RecordType] extends js.Object {
  var children: TagMod[Any]
}

object FooterProps {
  @scala.inline
  def apply[RecordType](children: TagMod[Any] = null): FooterProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterProps[RecordType]]
  }
}

