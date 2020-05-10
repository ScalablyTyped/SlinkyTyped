package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRetentionConfigurationResponse extends js.Object {
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfiguration: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.RetentionConfiguration] = js.native
}

object PutRetentionConfigurationResponse {
  @scala.inline
  def apply(): PutRetentionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRetentionConfigurationResponse]
  }
  @scala.inline
  implicit class PutRetentionConfigurationResponseOps[Self <: PutRetentionConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetentionConfiguration(value: RetentionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionConfiguration")(js.undefined)
        ret
    }
  }
  
}

