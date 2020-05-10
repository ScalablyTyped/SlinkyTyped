package typingsSlinky.cypress.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFakeTimersConfig extends js.Object {
  var now: Double | js.Date = js.native
  var shouldAdvanceTime: Boolean = js.native
  var toFake: js.Array[String] = js.native
}

object SinonFakeTimersConfig {
  @scala.inline
  def apply(now: Double | js.Date, shouldAdvanceTime: Boolean, toFake: js.Array[String]): SinonFakeTimersConfig = {
    val __obj = js.Dynamic.literal(now = now.asInstanceOf[js.Any], shouldAdvanceTime = shouldAdvanceTime.asInstanceOf[js.Any], toFake = toFake.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonFakeTimersConfig]
  }
  @scala.inline
  implicit class SinonFakeTimersConfigOps[Self <: SinonFakeTimersConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNowDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldAdvanceTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAdvanceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToFake(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFake")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

