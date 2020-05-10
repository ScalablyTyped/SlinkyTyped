package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleExpiration extends js.Object {
  /**
    * Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.
    */
  var Date: js.UndefOr[js.Date] = js.native
  /**
    * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.
    */
  var Days: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Days] = js.native
  /**
    * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired; if set to false the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
    */
  var ExpiredObjectDeleteMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ExpiredObjectDeleteMarker] = js.native
}

object LifecycleExpiration {
  @scala.inline
  def apply(): LifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleExpiration]
  }
  @scala.inline
  implicit class LifecycleExpirationOps[Self <: LifecycleExpiration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(js.undefined)
        ret
    }
    @scala.inline
    def withDays(value: Days): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiredObjectDeleteMarker(value: ExpiredObjectDeleteMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiredObjectDeleteMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiredObjectDeleteMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiredObjectDeleteMarker")(js.undefined)
        ret
    }
  }
  
}

