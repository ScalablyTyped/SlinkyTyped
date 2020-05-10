package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyOutput extends js.Object {
  /**
    *  The ARN of the Project or ReportGroup resource that is associated with a resource policy. 
    */
  var resourceArn: js.UndefOr[NonEmptyString] = js.native
}

object PutResourcePolicyOutput {
  @scala.inline
  def apply(): PutResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyOutput]
  }
  @scala.inline
  implicit class PutResourcePolicyOutputOps[Self <: PutResourcePolicyOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(js.undefined)
        ret
    }
  }
  
}

