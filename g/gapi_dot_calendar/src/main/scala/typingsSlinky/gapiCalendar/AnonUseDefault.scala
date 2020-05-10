package typingsSlinky.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUseDefault extends js.Object {
  var overrides: js.UndefOr[js.Array[AnonMethod]] = js.native
  var useDefault: Boolean = js.native
}

object AnonUseDefault {
  @scala.inline
  def apply(useDefault: Boolean): AnonUseDefault = {
    val __obj = js.Dynamic.literal(useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUseDefault]
  }
  @scala.inline
  implicit class AnonUseDefaultOps[Self <: AnonUseDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrides(value: js.Array[AnonMethod]): Self = {
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
  }
  
}

