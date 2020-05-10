package typingsSlinky.awsSdk.cognitoidentityMod

import typingsSlinky.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityCredentialsInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdInput extends CognitoIdentityCredentialsInputs {
  /**
    * A standard AWS account ID (9+ digits).
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.AccountId] = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. The available provider names for Logins are as follows:   Facebook: graph.facebook.com    Amazon Cognito user pool: cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;, for example, cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789.    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com   
    */
  var Logins: js.UndefOr[LoginsMap] = js.native
}

object GetIdInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): GetIdInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdInput]
  }
  @scala.inline
  implicit class GetIdInputOps[Self <: GetIdInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withLogins(value: LoginsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logins")(js.undefined)
        ret
    }
  }
  
}

