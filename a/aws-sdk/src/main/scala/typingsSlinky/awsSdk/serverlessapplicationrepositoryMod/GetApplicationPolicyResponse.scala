package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationPolicyResponse extends js.Object {
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[listOfApplicationPolicyStatement] = js.native
}

object GetApplicationPolicyResponse {
  @scala.inline
  def apply(): GetApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationPolicyResponse]
  }
  @scala.inline
  implicit class GetApplicationPolicyResponseOps[Self <: GetApplicationPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatements(value: listOfApplicationPolicyStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statements")(js.undefined)
        ret
    }
  }
  
}

