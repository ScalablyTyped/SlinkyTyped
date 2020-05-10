package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryGroup extends js.Object {
  /**
    * Filters define the criteria for the group. The matchingCount field displays the number of resources that match the criteria. The notMatchingCount field displays the number of resources that don't match the criteria. 
    */
  var Filters: InventoryFilterList = js.native
  /**
    * The name of the group.
    */
  var Name: InventoryGroupName = js.native
}

object InventoryGroup {
  @scala.inline
  def apply(Filters: InventoryFilterList, Name: InventoryGroupName): InventoryGroup = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryGroup]
  }
  @scala.inline
  implicit class InventoryGroupOps[Self <: InventoryGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: InventoryFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: InventoryGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

