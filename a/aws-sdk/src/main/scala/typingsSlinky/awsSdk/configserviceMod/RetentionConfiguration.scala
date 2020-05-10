package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionConfiguration extends js.Object {
  /**
    * The name of the retention configuration object.
    */
  var Name: RetentionConfigurationName = js.native
  /**
    * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
    */
  var RetentionPeriodInDays: typingsSlinky.awsSdk.configserviceMod.RetentionPeriodInDays = js.native
}

object RetentionConfiguration {
  @scala.inline
  def apply(Name: RetentionConfigurationName, RetentionPeriodInDays: RetentionPeriodInDays): RetentionConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RetentionPeriodInDays = RetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionConfiguration]
  }
  @scala.inline
  implicit class RetentionConfigurationOps[Self <: RetentionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: RetentionConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionPeriodInDays(value: RetentionPeriodInDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPeriodInDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

