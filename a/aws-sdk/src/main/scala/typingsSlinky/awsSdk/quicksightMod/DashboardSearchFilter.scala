package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardSearchFilter extends js.Object {
  /**
    * The name of the value that you want to use as a filter. For example, "Name": "QUICKSIGHT_USER". 
    */
  var Name: js.UndefOr[DashboardFilterAttribute] = js.native
  /**
    * The comparison operator that you want to use as a filter. For example, "Operator": "StringEquals".
    */
  var Operator: FilterOperator = js.native
  /**
    * The value of the named item, in this case QUICKSIGHT_USER, that you want to use as a filter. For example, "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1". 
    */
  var Value: js.UndefOr[String] = js.native
}

object DashboardSearchFilter {
  @scala.inline
  def apply(Operator: FilterOperator): DashboardSearchFilter = {
    val __obj = js.Dynamic.literal(Operator = Operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSearchFilter]
  }
  @scala.inline
  implicit class DashboardSearchFilterOps[Self <: DashboardSearchFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperator(value: FilterOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: DashboardFilterAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

