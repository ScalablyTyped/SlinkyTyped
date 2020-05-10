package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRetention extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var Days: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Days] = js.native
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var Years: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Years] = js.native
}

object DefaultRetention {
  @scala.inline
  def apply(): DefaultRetention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRetention]
  }
  @scala.inline
  implicit class DefaultRetentionOps[Self <: DefaultRetention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withYears(value: Years): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Years")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Years")(js.undefined)
        ret
    }
  }
  
}

