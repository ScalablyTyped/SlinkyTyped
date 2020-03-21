package typingsSlinky.reactElemental

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  val disabled: js.UndefOr[Boolean] = js.undefined
  val label: String | TagMod[Any]
  val value: String
}

object AnonDisabled {
  @scala.inline
  def apply(label: String | TagMod[Any], value: String, disabled: js.UndefOr[Boolean] = js.undefined): AnonDisabled = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
}

