package typingsSlinky.antd.anon

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: TagMod[Any]
  var style: CSSProperties
}

object Label {
  @scala.inline
  def apply(style: CSSProperties, label: TagMod[Any] = null): Label = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

