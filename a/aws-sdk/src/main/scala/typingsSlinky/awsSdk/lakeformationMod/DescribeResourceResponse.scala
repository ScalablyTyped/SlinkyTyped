package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourceResponse extends js.Object {
  /**
    * A structure containing information about an AWS Lake Formation resource.
    */
  var ResourceInfo: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.ResourceInfo] = js.native
}

object DescribeResourceResponse {
  @scala.inline
  def apply(): DescribeResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourceResponse]
  }
  @scala.inline
  implicit class DescribeResourceResponseOps[Self <: DescribeResourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceInfo(value: ResourceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceInfo")(js.undefined)
        ret
    }
  }
  
}

