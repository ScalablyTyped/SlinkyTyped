package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyOutput extends js.Object {
  /**
    *  The resource policy for the resource identified by the input ARN parameter. 
    */
  var policy: js.UndefOr[NonEmptyString] = js.native
}

object GetResourcePolicyOutput {
  @scala.inline
  def apply(): GetResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyOutput]
  }
  @scala.inline
  implicit class GetResourcePolicyOutputOps[Self <: GetResourcePolicyOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
  }
  
}

