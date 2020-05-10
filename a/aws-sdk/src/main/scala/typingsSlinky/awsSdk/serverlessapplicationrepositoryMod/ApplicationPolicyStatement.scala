package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationPolicyStatement extends js.Object {
  /**
    * For the list of actions supported for this operation, see Application 
    Permissions.
    */
  var Actions: listOfString = js.native
  /**
    * An array of PrinciplalOrgIDs, which corresponds to AWS IAM aws:PrincipalOrgID global condition key.
    */
  var PrincipalOrgIDs: js.UndefOr[listOfString] = js.native
  /**
    * An array of AWS account IDs, or * to make the application public.
    */
  var Principals: listOfString = js.native
  /**
    * A unique ID for the statement.
    */
  var StatementId: js.UndefOr[string] = js.native
}

object ApplicationPolicyStatement {
  @scala.inline
  def apply(Actions: listOfString, Principals: listOfString): ApplicationPolicyStatement = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Principals = Principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationPolicyStatement]
  }
  @scala.inline
  implicit class ApplicationPolicyStatementOps[Self <: ApplicationPolicyStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipals(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipalOrgIDs(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalOrgIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalOrgIDs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalOrgIDs")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementId")(js.undefined)
        ret
    }
  }
  
}

