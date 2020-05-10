package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageStatusDetails extends js.Object {
  /**
    * The status of the scan of the Docker image container for the model package.
    */
  var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.native
  /**
    * The validation status of the model package.
    */
  var ValidationStatuses: ModelPackageStatusItemList = js.native
}

object ModelPackageStatusDetails {
  @scala.inline
  def apply(ValidationStatuses: ModelPackageStatusItemList): ModelPackageStatusDetails = {
    val __obj = js.Dynamic.literal(ValidationStatuses = ValidationStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageStatusDetails]
  }
  @scala.inline
  implicit class ModelPackageStatusDetailsOps[Self <: ModelPackageStatusDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationStatuses(value: ModelPackageStatusItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageScanStatuses(value: ModelPackageStatusItemList): Self = {
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
  }
  
}

