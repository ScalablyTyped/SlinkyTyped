package typingsSlinky.antd.libSelectMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledValue extends js.Object {
  var key: String
  var label: TagMod[Any]
}

object LabeledValue {
  @scala.inline
  def apply(key: String, label: TagMod[Any]): LabeledValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabeledValue]
  }
}

