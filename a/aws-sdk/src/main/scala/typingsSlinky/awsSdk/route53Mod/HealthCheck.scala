package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheck extends js.Object {
  /**
    * A unique string that you specified when you created the health check.
    */
  var CallerReference: HealthCheckNonce = js.native
  /**
    * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.
    */
  var CloudWatchAlarmConfiguration: js.UndefOr[typingsSlinky.awsSdk.route53Mod.CloudWatchAlarmConfiguration] = js.native
  /**
    * A complex type that contains detailed information about one health check.
    */
  var HealthCheckConfig: typingsSlinky.awsSdk.route53Mod.HealthCheckConfig = js.native
  /**
    * The version of the health check. You can optionally pass this value in a call to UpdateHealthCheck to prevent overwriting another change to the health check.
    */
  var HealthCheckVersion: typingsSlinky.awsSdk.route53Mod.HealthCheckVersion = js.native
  /**
    * The identifier that Amazon Route 53assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long. 
    */
  var Id: HealthCheckId = js.native
  /**
    * If the health check was created by another service, the service that created the health check. When a health check is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var LinkedService: js.UndefOr[typingsSlinky.awsSdk.route53Mod.LinkedService] = js.native
}

object HealthCheck {
  @scala.inline
  def apply(
    CallerReference: HealthCheckNonce,
    HealthCheckConfig: HealthCheckConfig,
    HealthCheckVersion: HealthCheckVersion,
    Id: HealthCheckId
  ): HealthCheck = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], HealthCheckConfig = HealthCheckConfig.asInstanceOf[js.Any], HealthCheckVersion = HealthCheckVersion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
  @scala.inline
  implicit class HealthCheckOps[Self <: HealthCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerReference(value: HealthCheckNonce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthCheckConfig(value: HealthCheckConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthCheckVersion(value: HealthCheckVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: HealthCheckId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudWatchAlarmConfiguration(value: CloudWatchAlarmConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchAlarmConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchAlarmConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchAlarmConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedService(value: LinkedService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedService")(js.undefined)
        ret
    }
  }
  
}

