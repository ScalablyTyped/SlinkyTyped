package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkforceResponse extends js.Object {
  /**
    * A single private workforce, which is automatically created when you create your first private work team. You can create one private work force in each AWS Region. By default, any workforce-related API operation used in a specific region will apply to the workforce created in that region. To learn how to create a private workforce, see Create a Private Workforce.
    */
  var Workforce: typingsSlinky.awsSdk.sagemakerMod.Workforce = js.native
}

object DescribeWorkforceResponse {
  @scala.inline
  def apply(Workforce: Workforce): DescribeWorkforceResponse = {
    val __obj = js.Dynamic.literal(Workforce = Workforce.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkforceResponse]
  }
  @scala.inline
  implicit class DescribeWorkforceResponseOps[Self <: DescribeWorkforceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkforce(value: Workforce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workforce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

