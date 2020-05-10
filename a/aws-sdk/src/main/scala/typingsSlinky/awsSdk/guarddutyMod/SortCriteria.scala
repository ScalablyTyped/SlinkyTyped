package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCriteria extends js.Object {
  /**
    * Represents the finding attribute (for example, accountId) by which to sort findings.
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * Order by which the sorted findings are to be displayed.
    */
  var OrderBy: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.OrderBy] = js.native
}

object SortCriteria {
  @scala.inline
  def apply(): SortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortCriteria]
  }
  @scala.inline
  implicit class SortCriteriaOps[Self <: SortCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: OrderBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderBy")(js.undefined)
        ret
    }
  }
  
}

