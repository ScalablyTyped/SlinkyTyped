package typingsSlinky.googleapis

import typingsSlinky.googleapis.booksV1Mod.booksV1.SchemaReadingPosition
import typingsSlinky.googleapis.booksV1Mod.booksV1.SchemaReview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcquiredTime extends js.Object {
  var acquiredTime: js.UndefOr[String] = js.native
  var acquisitionType: js.UndefOr[Double] = js.native
  var copy: js.UndefOr[AnonLimitType] = js.native
  var entitlementType: js.UndefOr[Double] = js.native
  var familySharing: js.UndefOr[AnonFamilyRole] = js.native
  var isFamilySharedFromUser: js.UndefOr[Boolean] = js.native
  var isFamilySharedToUser: js.UndefOr[Boolean] = js.native
  var isFamilySharingAllowed: js.UndefOr[Boolean] = js.native
  var isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.native
  var isInMyBooks: js.UndefOr[Boolean] = js.native
  var isPreordered: js.UndefOr[Boolean] = js.native
  var isPurchased: js.UndefOr[Boolean] = js.native
  var isUploaded: js.UndefOr[Boolean] = js.native
  var readingPosition: js.UndefOr[SchemaReadingPosition] = js.native
  var rentalPeriod: js.UndefOr[AnonEndUtcSec] = js.native
  var rentalState: js.UndefOr[String] = js.native
  var review: js.UndefOr[SchemaReview] = js.native
  var updated: js.UndefOr[String] = js.native
  var userUploadedVolumeInfo: js.UndefOr[AnonProcessingState] = js.native
}

object AnonAcquiredTime {
  @scala.inline
  def apply(): AnonAcquiredTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAcquiredTime]
  }
  @scala.inline
  implicit class AnonAcquiredTimeOps[Self <: AnonAcquiredTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquiredTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquiredTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquiredTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquiredTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAcquisitionType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquisitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquisitionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquisitionType")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: AnonLimitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitlementType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlementType")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilySharing(value: AnonFamilyRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familySharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilySharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familySharing")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFamilySharedFromUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFamilySharedFromUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFamilySharedFromUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFamilySharedFromUser")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFamilySharedToUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFamilySharedToUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFamilySharedToUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFamilySharedToUser")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFamilySharingAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFamilySharingAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFamilySharingAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFamilySharingAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFamilySharingDisabledByFop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFamilySharingDisabledByFop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFamilySharingDisabledByFop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFamilySharingDisabledByFop")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInMyBooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInMyBooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInMyBooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInMyBooks")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPreordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPreordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreordered")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPurchased(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPurchased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPurchased: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPurchased")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUploaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withReadingPosition(value: SchemaReadingPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadingPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRentalPeriod(value: AnonEndUtcSec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rentalPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRentalPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rentalPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withRentalState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rentalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRentalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rentalState")(js.undefined)
        ret
    }
    @scala.inline
    def withReview(value: SchemaReview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withUserUploadedVolumeInfo(value: AnonProcessingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUploadedVolumeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserUploadedVolumeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUploadedVolumeInfo")(js.undefined)
        ret
    }
  }
  
}

