package typingsSlinky.reactTable.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableKeyedProps extends TableCommonProps {
  var key: Key
}

object TableKeyedProps {
  @scala.inline
  def apply(key: Key, className: String = null, role: String = null, style: CSSProperties = null): TableKeyedProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyedProps]
  }
}

