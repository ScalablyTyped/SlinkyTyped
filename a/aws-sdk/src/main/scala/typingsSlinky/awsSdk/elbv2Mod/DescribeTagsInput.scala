package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the resources. You can specify up to 20 resources in a single call.
    */
  var ResourceArns: typingsSlinky.awsSdk.elbv2Mod.ResourceArns = js.native
}

object DescribeTagsInput {
  @scala.inline
  def apply(ResourceArns: ResourceArns): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsInput]
  }
  @scala.inline
  implicit class DescribeTagsInputOps[Self <: DescribeTagsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArns(value: ResourceArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

