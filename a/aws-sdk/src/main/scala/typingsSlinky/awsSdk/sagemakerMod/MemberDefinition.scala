package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberDefinition extends js.Object {
  /**
    * The Amazon Cognito user group that is part of the work team.
    */
  var CognitoMemberDefinition: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CognitoMemberDefinition] = js.native
}

object MemberDefinition {
  @scala.inline
  def apply(): MemberDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberDefinition]
  }
  @scala.inline
  implicit class MemberDefinitionOps[Self <: MemberDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCognitoMemberDefinition(value: CognitoMemberDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoMemberDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoMemberDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoMemberDefinition")(js.undefined)
        ret
    }
  }
  
}

