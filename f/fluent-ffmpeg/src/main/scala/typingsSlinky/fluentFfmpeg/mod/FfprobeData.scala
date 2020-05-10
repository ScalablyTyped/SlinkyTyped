package typingsSlinky.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FfprobeData extends js.Object {
  var chapters: js.Array[_] = js.native
  var format: FfprobeFormat = js.native
  var streams: js.Array[FfprobeStream] = js.native
}

object FfprobeData {
  @scala.inline
  def apply(chapters: js.Array[_], format: FfprobeFormat, streams: js.Array[FfprobeStream]): FfprobeData = {
    val __obj = js.Dynamic.literal(chapters = chapters.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeData]
  }
  @scala.inline
  implicit class FfprobeDataOps[Self <: FfprobeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChapters(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: FfprobeFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreams(value: js.Array[FfprobeStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

