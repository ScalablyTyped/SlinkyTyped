package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSolutionResponse extends js.Object {
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.native
}

object CreateSolutionResponse {
  @scala.inline
  def apply(): CreateSolutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSolutionResponse]
  }
  @scala.inline
  implicit class CreateSolutionResponseOps[Self <: CreateSolutionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSolutionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionArn")(js.undefined)
        ret
    }
  }
  
}

