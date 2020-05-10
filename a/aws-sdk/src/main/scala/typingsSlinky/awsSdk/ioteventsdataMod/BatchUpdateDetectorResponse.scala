package typingsSlinky.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateDetectorResponse extends js.Object {
  /**
    * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did not occur.)
    */
  var batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries] = js.native
}

object BatchUpdateDetectorResponse {
  @scala.inline
  def apply(): BatchUpdateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDetectorResponse]
  }
  @scala.inline
  implicit class BatchUpdateDetectorResponseOps[Self <: BatchUpdateDetectorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchUpdateDetectorErrorEntries(value: BatchUpdateDetectorErrorEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchUpdateDetectorErrorEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchUpdateDetectorErrorEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchUpdateDetectorErrorEntries")(js.undefined)
        ret
    }
  }
  
}

