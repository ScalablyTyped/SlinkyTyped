package typingsSlinky.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamInfo extends js.Object {
  var blocks: Double = js.native
  var checks: Double = js.native
  var fileSize: Double = js.native
  var memlimit: Double = js.native
  var streamPadding: Double = js.native
  var streams: Double = js.native
  var uncompressedSize: Double = js.native
}

object StreamInfo {
  @scala.inline
  def apply(
    blocks: Double,
    checks: Double,
    fileSize: Double,
    memlimit: Double,
    streamPadding: Double,
    streams: Double,
    uncompressedSize: Double
  ): StreamInfo = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], memlimit = memlimit.asInstanceOf[js.Any], streamPadding = streamPadding.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInfo]
  }
  @scala.inline
  implicit class StreamInfoOps[Self <: StreamInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemlimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncompressedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncompressedSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

