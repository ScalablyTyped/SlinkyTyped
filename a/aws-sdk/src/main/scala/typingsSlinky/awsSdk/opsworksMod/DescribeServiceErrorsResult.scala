package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceErrorsResult extends js.Object {
  /**
    * An array of ServiceError objects that describe the specified service errors.
    */
  var ServiceErrors: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.ServiceErrors] = js.native
}

object DescribeServiceErrorsResult {
  @scala.inline
  def apply(): DescribeServiceErrorsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceErrorsResult]
  }
  @scala.inline
  implicit class DescribeServiceErrorsResultOps[Self <: DescribeServiceErrorsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceErrors(value: ServiceErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceErrors")(js.undefined)
        ret
    }
  }
  
}

