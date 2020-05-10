package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagOptionOutput extends js.Object {
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.TagOptionDetail] = js.native
}

object DescribeTagOptionOutput {
  @scala.inline
  def apply(): DescribeTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagOptionOutput]
  }
  @scala.inline
  implicit class DescribeTagOptionOutputOps[Self <: DescribeTagOptionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagOptionDetail(value: TagOptionDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptionDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagOptionDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptionDetail")(js.undefined)
        ret
    }
  }
  
}

