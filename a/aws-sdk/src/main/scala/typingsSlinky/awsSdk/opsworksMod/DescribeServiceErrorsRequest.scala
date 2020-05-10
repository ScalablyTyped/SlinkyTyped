package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceErrorsRequest extends js.Object {
  /**
    * The instance ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * An array of service error IDs. If you use this parameter, DescribeServiceErrors returns descriptions of the specified errors. Otherwise, it returns a description of every error.
    */
  var ServiceErrorIds: js.UndefOr[Strings] = js.native
  /**
    * The stack ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeServiceErrorsRequest {
  @scala.inline
  def apply(): DescribeServiceErrorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceErrorsRequest]
  }
  @scala.inline
  implicit class DescribeServiceErrorsRequestOps[Self <: DescribeServiceErrorsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceErrorIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceErrorIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceErrorIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceErrorIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

