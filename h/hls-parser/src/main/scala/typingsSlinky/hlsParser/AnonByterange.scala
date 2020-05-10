package typingsSlinky.hlsParser

import typingsSlinky.hlsParser.mod.Byterange
import typingsSlinky.hlsParser.mod.types.DateRange
import typingsSlinky.hlsParser.mod.types.Key
import typingsSlinky.hlsParser.mod.types.MediaInitializationSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonByterange extends js.Object {
  var byterange: js.UndefOr[Byterange] = js.native
  var dateRange: js.UndefOr[DateRange] = js.native
  var discontinuity: js.UndefOr[Boolean] = js.native
  var discontinuitySequence: Double = js.native
  var duration: Double = js.native
  var key: js.UndefOr[Key] = js.native
  var map: js.UndefOr[MediaInitializationSection] = js.native
  var mediaSequenceNumber: Double = js.native
  var programDateTime: js.UndefOr[js.Date] = js.native
  var title: js.UndefOr[String] = js.native
  var uri: String = js.native
}

object AnonByterange {
  @scala.inline
  def apply(discontinuitySequence: Double, duration: Double, mediaSequenceNumber: Double, uri: String): AnonByterange = {
    val __obj = js.Dynamic.literal(discontinuitySequence = discontinuitySequence.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], mediaSequenceNumber = mediaSequenceNumber.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonByterange]
  }
  @scala.inline
  implicit class AnonByterangeOps[Self <: AnonByterange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscontinuitySequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discontinuitySequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaSequenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByterange(value: Byterange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byterange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByterange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byterange")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRange(value: DateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscontinuity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discontinuity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscontinuity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discontinuity")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: MediaInitializationSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

