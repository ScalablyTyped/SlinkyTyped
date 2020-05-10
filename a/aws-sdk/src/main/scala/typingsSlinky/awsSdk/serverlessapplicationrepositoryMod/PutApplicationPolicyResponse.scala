package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutApplicationPolicyResponse extends js.Object {
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[listOfApplicationPolicyStatement] = js.native
}

object PutApplicationPolicyResponse {
  @scala.inline
  def apply(): PutApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutApplicationPolicyResponse]
  }
  @scala.inline
  implicit class PutApplicationPolicyResponseOps[Self <: PutApplicationPolicyResponse] (val x: Self) extends AnyVal {
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

