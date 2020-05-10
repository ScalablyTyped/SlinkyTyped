package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3KeyFilter extends js.Object {
  var FilterRules: js.UndefOr[FilterRuleList] = js.native
}

object S3KeyFilter {
  @scala.inline
  def apply(): S3KeyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3KeyFilter]
  }
  @scala.inline
  implicit class S3KeyFilterOps[Self <: S3KeyFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterRules(value: FilterRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterRules")(js.undefined)
        ret
    }
  }
  
}

