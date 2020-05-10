package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserComment extends js.Object {
  /** Integer Android SDK version of the user's device at the time the review was written, e.g. 23 is Marshmallow. May be absent. */
  var androidOsVersion: js.UndefOr[Double] = js.native
  /** Integer version code of the app as installed at the time the review was written. May be absent. */
  var appVersionCode: js.UndefOr[Double] = js.native
  /** String version name of the app as installed at the time the review was written. May be absent. */
  var appVersionName: js.UndefOr[String] = js.native
  /** Codename for the reviewer's device, e.g. klte, flounder. May be absent. */
  var device: js.UndefOr[String] = js.native
  /** Some information about the characteristics of the user's device */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.native
  /** The last time at which this comment was updated. */
  var lastModified: js.UndefOr[Timestamp] = js.native
  /** Untranslated text of the review, in the case where the review has been translated. If the review has not been translated this is left blank. */
  var originalText: js.UndefOr[String] = js.native
  /**
    * Language code for the reviewer. This is taken from the device settings so is not guaranteed to match the language the review is written in. May be
    * absent.
    */
  var reviewerLanguage: js.UndefOr[String] = js.native
  /** The star rating associated with the review, from 1 to 5. */
  var starRating: js.UndefOr[Double] = js.native
  /**
    * The content of the comment, i.e. review body. In some cases users have been able to write a review with separate title and body; in those cases the
    * title and body are concatenated and separated by a tab character.
    */
  var text: js.UndefOr[String] = js.native
  /** Number of users who have given this review a thumbs down */
  var thumbsDownCount: js.UndefOr[Double] = js.native
  /** Number of users who have given this review a thumbs up */
  var thumbsUpCount: js.UndefOr[Double] = js.native
}

object UserComment {
  @scala.inline
  def apply(): UserComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserComment]
  }
  @scala.inline
  implicit class UserCommentOps[Self <: UserComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidOsVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidOsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidOsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidOsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAppVersionCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAppVersionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersionName")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceMetadata(value: DeviceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalText")(js.undefined)
        ret
    }
    @scala.inline
    def withReviewerLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewerLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviewerLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewerLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withStarRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starRating")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbsDownCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbsDownCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbsDownCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbsDownCount")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbsUpCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbsUpCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbsUpCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbsUpCount")(js.undefined)
        ret
    }
  }
  
}

