package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapeArchivesOutput extends js.Object {
  /**
    * An opaque string that indicates the position at which the virtual tapes that were fetched for description ended. Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape shelf (VTS). If there are no more virtual tapes to describe, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes, size of the tapes, status of the tapes, progress of the description and tape barcode.
    */
  var TapeArchives: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeArchives] = js.native
}

object DescribeTapeArchivesOutput {
  @scala.inline
  def apply(): DescribeTapeArchivesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapeArchivesOutput]
  }
  @scala.inline
  implicit class DescribeTapeArchivesOutputOps[Self <: DescribeTapeArchivesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withTapeArchives(value: TapeArchives): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeArchives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeArchives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeArchives")(js.undefined)
        ret
    }
  }
  
}

