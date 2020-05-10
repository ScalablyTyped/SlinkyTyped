package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImagesFilter extends js.Object {
  /**
    * The tag status with which to filter your DescribeImages results. You can filter results based on whether they are TAGGED or UNTAGGED.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.native
}

object DescribeImagesFilter {
  @scala.inline
  def apply(): DescribeImagesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesFilter]
  }
  @scala.inline
  implicit class DescribeImagesFilterOps[Self <: DescribeImagesFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagStatus(value: TagStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagStatus")(js.undefined)
        ret
    }
  }
  
}

