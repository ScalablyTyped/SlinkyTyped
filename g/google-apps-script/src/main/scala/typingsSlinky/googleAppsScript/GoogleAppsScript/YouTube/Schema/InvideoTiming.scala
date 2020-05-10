package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvideoTiming extends js.Object {
  var durationMs: js.UndefOr[String] = js.native
  var offsetMs: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object InvideoTiming {
  @scala.inline
  def apply(): InvideoTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvideoTiming]
  }
  @scala.inline
  implicit class InvideoTimingOps[Self <: InvideoTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMs")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

