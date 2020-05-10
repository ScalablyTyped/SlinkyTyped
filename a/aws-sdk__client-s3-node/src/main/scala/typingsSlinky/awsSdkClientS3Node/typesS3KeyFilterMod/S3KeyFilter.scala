package typingsSlinky.awsSdkClientS3Node.typesS3KeyFilterMod

import typingsSlinky.awsSdkClientS3Node.typesFilterRuleMod.FilterRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3KeyFilter extends js.Object {
  /**
    * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
    */
  var FilterRules: js.UndefOr[js.Array[FilterRule] | js.Iterable[FilterRule]] = js.native
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
    def withFilterRulesIterable(value: js.Iterable[FilterRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterRules(value: js.Array[FilterRule] | js.Iterable[FilterRule]): Self = {
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

