package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockRetention extends js.Object {
  /**
    * Indicates the Retention mode for the specified object.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  /**
    * The date on which this Object Lock Retention will expire.
    */
  var RetainUntilDate: js.UndefOr[js.Date] = js.native
}

object ObjectLockRetention {
  @scala.inline
  def apply(): ObjectLockRetention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockRetention]
  }
  @scala.inline
  implicit class ObjectLockRetentionOps[Self <: ObjectLockRetention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: ObjectLockRetentionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainUntilDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainUntilDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainUntilDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainUntilDate")(js.undefined)
        ret
    }
  }
  
}

