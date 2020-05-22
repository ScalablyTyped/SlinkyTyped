package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arg extends js.Object {
  var arg: js.UndefOr[js.Date | Double | String] = js.undefined
  var `val`: js.UndefOr[js.Date | Double | String] = js.undefined
}

object Arg {
  @scala.inline
  def apply(arg: js.Date | Double | String = null, `val`: js.Date | Double | String = null): Arg = {
    val __obj = js.Dynamic.literal()
    if (arg != null) __obj.updateDynamic("arg")(arg.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arg]
  }
}

