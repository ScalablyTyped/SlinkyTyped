package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSolutionVersionResponse extends js.Object {
  /**
    * The ARN of the new solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}

object CreateSolutionVersionResponse {
  @scala.inline
  def apply(): CreateSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSolutionVersionResponse]
  }
  @scala.inline
  implicit class CreateSolutionVersionResponseOps[Self <: CreateSolutionVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSolutionVersionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(js.undefined)
        ret
    }
  }
  
}

