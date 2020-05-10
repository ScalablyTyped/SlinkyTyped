package typingsSlinky.devextreme

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBytesUploaded extends js.Object {
  var bytesUploaded: js.UndefOr[Double] = js.native
  var chunkBlob: js.UndefOr[Blob] = js.native
  var chunkCount: js.UndefOr[Double] = js.native
  var chunkIndex: js.UndefOr[Double] = js.native
  var customData: js.UndefOr[js.Any] = js.native
}

object AnonBytesUploaded {
  @scala.inline
  def apply(): AnonBytesUploaded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBytesUploaded]
  }
  @scala.inline
  implicit class AnonBytesUploadedOps[Self <: AnonBytesUploaded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesUploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkBlob(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkCount")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(js.undefined)
        ret
    }
  }
  
}

