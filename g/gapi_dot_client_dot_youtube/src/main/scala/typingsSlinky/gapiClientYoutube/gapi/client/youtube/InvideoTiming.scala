package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvideoTiming extends js.Object {
  /** Defines the duration in milliseconds for which the promotion should be displayed. If missing, the client should use the default. */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * Defines the time at which the promotion will appear. Depending on the value of type the value of the offsetMs field will represent a time offset from
    * the start or from the end of the video, expressed in milliseconds.
    */
  var offsetMs: js.UndefOr[String] = js.native
  /**
    * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is
    * offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
    */
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

