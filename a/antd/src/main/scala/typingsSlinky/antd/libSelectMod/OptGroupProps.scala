package typingsSlinky.antd.libSelectMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptGroupProps extends js.Object {
  var label: js.UndefOr[TagMod[Any]] = js.undefined
}

object OptGroupProps {
  @scala.inline
  def apply(label: TagMod[Any] = null): OptGroupProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroupProps]
  }
}

