package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSolutionResponse extends js.Object {
  /**
    * An object that describes the solution.
    */
  var solution: js.UndefOr[Solution] = js.native
}

object DescribeSolutionResponse {
  @scala.inline
  def apply(): DescribeSolutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSolutionResponse]
  }
  @scala.inline
  implicit class DescribeSolutionResponseOps[Self <: DescribeSolutionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSolution(value: Solution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solution")(js.undefined)
        ret
    }
  }
  
}

