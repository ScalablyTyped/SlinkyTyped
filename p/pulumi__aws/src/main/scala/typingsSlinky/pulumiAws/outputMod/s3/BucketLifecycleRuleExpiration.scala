package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRuleExpiration extends js.Object {
  /**
    * Specifies the date after which you want the corresponding action to take effect.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Double] = js.native
  /**
    * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers.
    */
  var expiredObjectDeleteMarker: js.UndefOr[Boolean] = js.native
}

object BucketLifecycleRuleExpiration {
  @scala.inline
  def apply(): BucketLifecycleRuleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLifecycleRuleExpiration]
  }
  @scala.inline
  implicit class BucketLifecycleRuleExpirationOps[Self <: BucketLifecycleRuleExpiration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiredObjectDeleteMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredObjectDeleteMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiredObjectDeleteMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredObjectDeleteMarker")(js.undefined)
        ret
    }
  }
  
}

