package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArg extends js.Object {
  var arg: js.UndefOr[js.Date | Double | String] = js.undefined
  var `val`: js.UndefOr[js.Date | Double | String] = js.undefined
}

object AnonArg {
  @scala.inline
  def apply(arg: js.Date | Double | String = null, `val`: js.Date | Double | String = null): AnonArg = {
    val __obj = js.Dynamic.literal()
    if (arg != null) __obj.updateDynamic("arg")(arg.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArg]
  }
}

