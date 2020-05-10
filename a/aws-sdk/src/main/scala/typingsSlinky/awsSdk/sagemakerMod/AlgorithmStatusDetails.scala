package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmStatusDetails extends js.Object {
  /**
    * The status of the scan of the algorithm's Docker image container.
    */
  var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.native
  /**
    * The status of algorithm validation.
    */
  var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.native
}

object AlgorithmStatusDetails {
  @scala.inline
  def apply(): AlgorithmStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmStatusDetails]
  }
  @scala.inline
  implicit class AlgorithmStatusDetailsOps[Self <: AlgorithmStatusDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageScanStatuses(value: AlgorithmStatusItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageScanStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScanStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageScanStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationStatuses(value: AlgorithmStatusItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationStatuses")(js.undefined)
        ret
    }
  }
  
}

