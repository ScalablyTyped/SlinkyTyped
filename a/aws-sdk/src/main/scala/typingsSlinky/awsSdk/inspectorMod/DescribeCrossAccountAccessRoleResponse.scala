package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCrossAccountAccessRoleResponse extends js.Object {
  /**
    * The date when the cross-account access role was registered.
    */
  var registeredAt: js.Date = js.native
  /**
    * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
    */
  var roleArn: Arn = js.native
  /**
    * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon Inspector to access your AWS account.
    */
  var valid: Bool = js.native
}

object DescribeCrossAccountAccessRoleResponse {
  @scala.inline
  def apply(registeredAt: js.Date, roleArn: Arn, valid: Bool): DescribeCrossAccountAccessRoleResponse = {
    val __obj = js.Dynamic.literal(registeredAt = registeredAt.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCrossAccountAccessRoleResponse]
  }
  @scala.inline
  implicit class DescribeCrossAccountAccessRoleResponseOps[Self <: DescribeCrossAccountAccessRoleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisteredAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Bool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

