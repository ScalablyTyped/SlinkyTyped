package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRetentionConfigurationRequest extends js.Object {
  /**
    * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
    */
  var RetentionPeriodInDays: typingsSlinky.awsSdk.configserviceMod.RetentionPeriodInDays = js.native
}

object PutRetentionConfigurationRequest {
  @scala.inline
  def apply(RetentionPeriodInDays: RetentionPeriodInDays): PutRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionPeriodInDays = RetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionConfigurationRequest]
  }
  @scala.inline
  implicit class PutRetentionConfigurationRequestOps[Self <: PutRetentionConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetentionPeriodInDays(value: RetentionPeriodInDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPeriodInDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

