package typingsSlinky.antd.treeSelectMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledValue extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var label: TagMod[Any]
  var value: RawValue
}

object LabeledValue {
  @scala.inline
  def apply(label: TagMod[Any], value: RawValue, key: String = null): LabeledValue = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledValue]
  }
}

