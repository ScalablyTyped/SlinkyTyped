package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  /**
    * The current number of uncompressed object bytes processed.
    */
  var BytesProcessed: js.UndefOr[typingsSlinky.awsSdk.s3Mod.BytesProcessed] = js.native
  /**
    * The current number of bytes of records payload data returned.
    */
  var BytesReturned: js.UndefOr[typingsSlinky.awsSdk.s3Mod.BytesReturned] = js.native
  /**
    * The current number of object bytes scanned.
    */
  var BytesScanned: js.UndefOr[typingsSlinky.awsSdk.s3Mod.BytesScanned] = js.native
}

object Progress {
  @scala.inline
  def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesProcessed(value: BytesProcessed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesReturned(value: BytesReturned): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesReturned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesReturned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesReturned")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesScanned(value: BytesScanned): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesScanned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesScanned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesScanned")(js.undefined)
        ret
    }
  }
  
}

