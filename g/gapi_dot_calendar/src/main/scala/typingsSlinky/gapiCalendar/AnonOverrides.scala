package typingsSlinky.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOverrides extends js.Object {
  var overrides: js.Array[AnonMinutes] = js.native
  var useDefault: Boolean = js.native
}

object AnonOverrides {
  @scala.inline
  def apply(overrides: js.Array[AnonMinutes], useDefault: Boolean): AnonOverrides = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any], useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverrides]
  }
  @scala.inline
  implicit class AnonOverridesOps[Self <: AnonOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverrides(value: js.Array[AnonMinutes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

