package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoMemberDefinition extends js.Object {
  /**
    * An identifier for an application client. You must create the app client ID using Amazon Cognito.
    */
  var ClientId: CognitoClientId = js.native
  /**
    * An identifier for a user group.
    */
  var UserGroup: CognitoUserGroup = js.native
  /**
    * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
    */
  var UserPool: CognitoUserPool = js.native
}

object CognitoMemberDefinition {
  @scala.inline
  def apply(ClientId: CognitoClientId, UserGroup: CognitoUserGroup, UserPool: CognitoUserPool): CognitoMemberDefinition = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserGroup = UserGroup.asInstanceOf[js.Any], UserPool = UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoMemberDefinition]
  }
  @scala.inline
  implicit class CognitoMemberDefinitionOps[Self <: CognitoMemberDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: CognitoClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserGroup(value: CognitoUserGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPool(value: CognitoUserPool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPool")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

