package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationType extends js.Object {
  /**
    * The application ID for an Amazon Pinpoint application.
    */
  var ApplicationId: HexStringType = js.native
  /**
    * The external ID.
    */
  var ExternalId: StringType = js.native
  /**
    * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
    */
  var RoleArn: ArnType = js.native
  /**
    * If UserDataShared is true, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
    */
  var UserDataShared: js.UndefOr[BooleanType] = js.native
}

object AnalyticsConfigurationType {
  @scala.inline
  def apply(ApplicationId: HexStringType, ExternalId: StringType, RoleArn: ArnType): AnalyticsConfigurationType = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ExternalId = ExternalId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationType]
  }
  @scala.inline
  implicit class AnalyticsConfigurationTypeOps[Self <: AnalyticsConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: HexStringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalId(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDataShared(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDataShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDataShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDataShared")(js.undefined)
        ret
    }
  }
  
}

