package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeDeveloperIdentitiesInput extends js.Object {
  /**
    * User identifier for the destination user. The value should be a DeveloperUserIdentifier.
    */
  var DestinationUserIdentifier: DeveloperUserIdentifier = js.native
  /**
    * The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide while creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters as well as period (.), underscore (_), and dash (-).
    */
  var DeveloperProviderName: typingsSlinky.awsSdk.cognitoidentityMod.DeveloperProviderName = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
  /**
    * User identifier for the source user. The value should be a DeveloperUserIdentifier.
    */
  var SourceUserIdentifier: DeveloperUserIdentifier = js.native
}

object MergeDeveloperIdentitiesInput {
  @scala.inline
  def apply(
    DestinationUserIdentifier: DeveloperUserIdentifier,
    DeveloperProviderName: DeveloperProviderName,
    IdentityPoolId: IdentityPoolId,
    SourceUserIdentifier: DeveloperUserIdentifier
  ): MergeDeveloperIdentitiesInput = {
    val __obj = js.Dynamic.literal(DestinationUserIdentifier = DestinationUserIdentifier.asInstanceOf[js.Any], DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SourceUserIdentifier = SourceUserIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeDeveloperIdentitiesInput]
  }
  @scala.inline
  implicit class MergeDeveloperIdentitiesInputOps[Self <: MergeDeveloperIdentitiesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationUserIdentifier(value: DeveloperUserIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationUserIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperProviderName(value: DeveloperProviderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceUserIdentifier(value: DeveloperUserIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceUserIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

