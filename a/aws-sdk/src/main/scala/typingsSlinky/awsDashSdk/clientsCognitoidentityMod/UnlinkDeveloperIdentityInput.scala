package typingsSlinky.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlinkDeveloperIdentityInput extends js.Object {
  /**
    * The "domain" by which Cognito will refer to your users.
    */
  var DeveloperProviderName: typingsSlinky.awsDashSdk.clientsCognitoidentityMod.DeveloperProviderName = js.native
  /**
    * A unique ID used by your backend authentication process to identify a user.
    */
  var DeveloperUserIdentifier: typingsSlinky.awsDashSdk.clientsCognitoidentityMod.DeveloperUserIdentifier = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typingsSlinky.awsDashSdk.clientsCognitoidentityMod.IdentityId = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typingsSlinky.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId = js.native
}

object UnlinkDeveloperIdentityInput {
  @scala.inline
  def apply(
    DeveloperProviderName: DeveloperProviderName,
    DeveloperUserIdentifier: DeveloperUserIdentifier,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): UnlinkDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], DeveloperUserIdentifier = DeveloperUserIdentifier.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnlinkDeveloperIdentityInput]
  }
}

