package typingsSlinky.reactDashTable.reactDashTableMod

import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableKeyedProps extends TableCommonProps {
  var key: Key
}

object TableKeyedProps {
  @scala.inline
  def apply(key: Key, style: CSSProperties = null): TableKeyedProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyedProps]
  }
}

