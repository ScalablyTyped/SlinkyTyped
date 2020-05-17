package typingsSlinky.gapiClientBooks.anon

import typingsSlinky.gapiClientBooks.gapi.client.books.ReadingPosition
import typingsSlinky.gapiClientBooks.gapi.client.books.Review
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcquiredTime extends js.Object {
  /**
    * Timestamp when this volume was acquired by the user. (RFC 3339 UTC date-time format) Acquiring includes purchase, user upload, receiving family
    * sharing, etc.
    */
  var acquiredTime: js.UndefOr[String] = js.native
  /** How this volume was acquired. */
  var acquisitionType: js.UndefOr[Double] = js.native
  /** Copy/Paste accounting information. */
  var copy: js.UndefOr[LimitType] = js.native
  /** Whether this volume is purchased, sample, pd download etc. */
  var entitlementType: js.UndefOr[Double] = js.native
  /** Information on the ability to share with the family. */
  var familySharing: js.UndefOr[FamilyRole] = js.native
  /** Whether or not the user shared this volume with the family. */
  var isFamilySharedFromUser: js.UndefOr[Boolean] = js.native
  /** Whether or not the user received this volume through family sharing. */
  var isFamilySharedToUser: js.UndefOr[Boolean] = js.native
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingAllowed: js.UndefOr[Boolean] = js.native
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.native
  /** Whether or not this volume is currently in "my books." */
  var isInMyBooks: js.UndefOr[Boolean] = js.native
  /** Whether or not this volume was pre-ordered by the authenticated user making the request. (In LITE projection.) */
  var isPreordered: js.UndefOr[Boolean] = js.native
  /** Whether or not this volume was purchased by the authenticated user making the request. (In LITE projection.) */
  var isPurchased: js.UndefOr[Boolean] = js.native
  /** Whether or not this volume was user uploaded. */
  var isUploaded: js.UndefOr[Boolean] = js.native
  /** The user's current reading position in the volume, if one is available. (In LITE projection.) */
  var readingPosition: js.UndefOr[ReadingPosition] = js.native
  /** Period during this book is/was a valid rental. */
  var rentalPeriod: js.UndefOr[EndUtcSec] = js.native
  /** Whether this book is an active or an expired rental. */
  var rentalState: js.UndefOr[String] = js.native
  /** This user's review of this volume, if one exists. */
  var review: js.UndefOr[Review] = js.native
  /**
    * Timestamp when this volume was last modified by a user action, such as a reading position update, volume purchase or writing a review. (RFC 3339 UTC
    * date-time format).
    */
  var updated: js.UndefOr[String] = js.native
  var userUploadedVolumeInfo: js.UndefOr[ProcessingState] = js.native
}

object AcquiredTime {
  @scala.inline
  def apply(): AcquiredTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquiredTime]
  }
  @scala.inline
  implicit class AcquiredTimeOps[Self <: AcquiredTime] (val x: Self) extends AnyVal {
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
    def withCopy(value: LimitType): Self = {
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
    def withFamilySharing(value: FamilyRole): Self = {
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
    def withReadingPosition(value: ReadingPosition): Self = {
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
    def withRentalPeriod(value: EndUtcSec): Self = {
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
    def withReview(value: Review): Self = {
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
    def withUserUploadedVolumeInfo(value: ProcessingState): Self = {
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

