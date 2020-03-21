package typingsSlinky.reactElemental

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelValue extends js.Object {
  val label: String | TagMod[Any]
  val value: String
}

object AnonLabelValue {
  @scala.inline
  def apply(label: String | TagMod[Any], value: String): AnonLabelValue = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabelValue]
  }
}

