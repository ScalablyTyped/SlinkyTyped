package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvFormat extends js.Object {
  var bit_rate: String = js.native
  var duration: String = js.native
  var format_long_name: String = js.native
  var format_name: String = js.native
  var nb_streams: Double = js.native
  var size: String = js.native
  var start_time: String = js.native
  var tags: AnonDictkey = js.native
}

object AvFormat {
  @scala.inline
  def apply(
    bit_rate: String,
    duration: String,
    format_long_name: String,
    format_name: String,
    nb_streams: Double,
    size: String,
    start_time: String,
    tags: AnonDictkey
  ): AvFormat = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], format_long_name = format_long_name.asInstanceOf[js.Any], format_name = format_name.asInstanceOf[js.Any], nb_streams = nb_streams.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvFormat]
  }
  @scala.inline
  implicit class AvFormatOps[Self <: AvFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBit_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bit_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat_long_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_long_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNb_streams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: AnonDictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

