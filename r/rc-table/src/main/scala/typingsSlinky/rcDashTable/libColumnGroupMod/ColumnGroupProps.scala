package typingsSlinky.rcDashTable.libColumnGroupMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupProps extends js.Object {
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object ColumnGroupProps {
  @scala.inline
  def apply(title: TagMod[Any] = null): ColumnGroupProps = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps]
  }
}

