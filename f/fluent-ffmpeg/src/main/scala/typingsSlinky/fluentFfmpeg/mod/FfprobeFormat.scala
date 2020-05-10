package typingsSlinky.fluentFfmpeg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FfprobeFormat
  extends /* key */ StringDictionary[js.Any] {
  var bit_rate: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var filename: js.UndefOr[String] = js.native
  var format_long_name: js.UndefOr[String] = js.native
  var format_name: js.UndefOr[String] = js.native
  var nb_programs: js.UndefOr[Double] = js.native
  var nb_streams: js.UndefOr[Double] = js.native
  var probe_score: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var start_time: js.UndefOr[Double] = js.native
  var tags: js.UndefOr[js.Array[_]] = js.native
}

object FfprobeFormat {
  @scala.inline
  def apply(): FfprobeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FfprobeFormat]
  }
  @scala.inline
  implicit class FfprobeFormatOps[Self <: FfprobeFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBit_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bit_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBit_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bit_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_long_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_long_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_long_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_long_name")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_name")(js.undefined)
        ret
    }
    @scala.inline
    def withNb_programs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_programs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNb_programs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_programs")(js.undefined)
        ret
    }
    @scala.inline
    def withNb_streams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNb_streams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_streams")(js.undefined)
        ret
    }
    @scala.inline
    def withProbe_score(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probe_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProbe_score: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probe_score")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

