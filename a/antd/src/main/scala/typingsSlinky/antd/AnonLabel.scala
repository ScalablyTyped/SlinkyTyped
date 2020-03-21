package typingsSlinky.antd

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: TagMod[Any]
  var style: CSSProperties
}

object AnonLabel {
  @scala.inline
  def apply(label: TagMod[Any], style: CSSProperties): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabel]
  }
}

