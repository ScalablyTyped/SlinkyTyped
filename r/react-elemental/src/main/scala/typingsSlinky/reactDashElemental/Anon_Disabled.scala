package typingsSlinky.reactDashElemental

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  val disabled: js.UndefOr[Boolean] = js.undefined
  val label: String | TagMod[Any]
  val value: String
}

object Anon_Disabled {
  @scala.inline
  def apply(label: String | TagMod[Any], value: String, disabled: js.UndefOr[Boolean] = js.undefined): Anon_Disabled = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Disabled]
  }
}

