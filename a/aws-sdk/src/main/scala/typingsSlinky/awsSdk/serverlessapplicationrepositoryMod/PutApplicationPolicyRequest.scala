package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutApplicationPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: listOfApplicationPolicyStatement = js.native
}

object PutApplicationPolicyRequest {
  @scala.inline
  def apply(ApplicationId: string, Statements: listOfApplicationPolicyStatement): PutApplicationPolicyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutApplicationPolicyRequest]
  }
  @scala.inline
  implicit class PutApplicationPolicyRequestOps[Self <: PutApplicationPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatements(value: listOfApplicationPolicyStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

