package typingsSlinky.reactElemental.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelValue extends js.Object {
  val label: String | TagMod[Any]
  val value: String
}

object LabelValue {
  @scala.inline
  def apply(value: String, label: String | TagMod[Any] = null): LabelValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelValue]
  }
}

