package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActivationsFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.native
  /**
    * The filter values.
    */
  var FilterValues: js.UndefOr[StringList] = js.native
}

object DescribeActivationsFilter {
  @scala.inline
  def apply(): DescribeActivationsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivationsFilter]
  }
  @scala.inline
  implicit class DescribeActivationsFilterOps[Self <: DescribeActivationsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterKey(value: DescribeActivationsFilterKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValues(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterValues")(js.undefined)
        ret
    }
  }
  
}

