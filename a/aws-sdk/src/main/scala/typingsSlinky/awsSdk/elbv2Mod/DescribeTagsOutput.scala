package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsOutput extends js.Object {
  /**
    * Information about the tags.
    */
  var TagDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TagDescriptions] = js.native
}

object DescribeTagsOutput {
  @scala.inline
  def apply(): DescribeTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsOutput]
  }
  @scala.inline
  implicit class DescribeTagsOutputOps[Self <: DescribeTagsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagDescriptions(value: TagDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagDescriptions")(js.undefined)
        ret
    }
  }
  
}

