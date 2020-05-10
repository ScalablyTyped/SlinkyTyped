package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventCategoriesResponse extends js.Object {
  /**
    * A list of event categories.
    */
  var EventCategoryGroupList: js.UndefOr[typingsSlinky.awsSdk.dmsMod.EventCategoryGroupList] = js.native
}

object DescribeEventCategoriesResponse {
  @scala.inline
  def apply(): DescribeEventCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventCategoriesResponse]
  }
  @scala.inline
  implicit class DescribeEventCategoriesResponseOps[Self <: DescribeEventCategoriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventCategoryGroupList(value: EventCategoryGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategoryGroupList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCategoryGroupList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategoryGroupList")(js.undefined)
        ret
    }
  }
  
}

