package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemAttribute extends js.Object {
  /**
    * The data type of the inventory item attribute. 
    */
  var DataType: InventoryAttributeDataType = js.native
  /**
    * Name of the inventory item attribute.
    */
  var Name: InventoryItemAttributeName = js.native
}

object InventoryItemAttribute {
  @scala.inline
  def apply(DataType: InventoryAttributeDataType, Name: InventoryItemAttributeName): InventoryItemAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemAttribute]
  }
  @scala.inline
  implicit class InventoryItemAttributeOps[Self <: InventoryItemAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: InventoryAttributeDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: InventoryItemAttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

