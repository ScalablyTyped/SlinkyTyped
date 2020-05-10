package typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadVideoSegmentInitOptions extends js.Object {
  var ruploadParams: js.Any = js.native
  var startOffset: Double = js.native
  var streamId: String = js.native
  var transferId: String = js.native
  var waterfallId: String = js.native
}

object UploadVideoSegmentInitOptions {
  @scala.inline
  def apply(
    ruploadParams: js.Any,
    startOffset: Double,
    streamId: String,
    transferId: String,
    waterfallId: String
  ): UploadVideoSegmentInitOptions = {
    val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], transferId = transferId.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadVideoSegmentInitOptions]
  }
  @scala.inline
  implicit class UploadVideoSegmentInitOptionsOps[Self <: UploadVideoSegmentInitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuploadParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruploadParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaterfallId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

