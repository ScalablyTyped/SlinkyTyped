package typingsSlinky.googleapis

import typingsSlinky.googleapis.calendarV3Mod.calendarV3.SchemaEventReminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOverrides extends js.Object {
  var overrides: js.UndefOr[js.Array[SchemaEventReminder]] = js.native
  var useDefault: js.UndefOr[Boolean] = js.native
}

object AnonOverrides {
  @scala.inline
  def apply(): AnonOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOverrides]
  }
  @scala.inline
  implicit class AnonOverridesOps[Self <: AnonOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverrides(value: js.Array[SchemaEventReminder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(js.undefined)
        ret
    }
  }
  
}

