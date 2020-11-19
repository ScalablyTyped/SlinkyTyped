package typingsSlinky.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The capacity of a product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#capacity.
  */
@js.native
trait SchemaCapacity extends js.Object {
  
  /**
    * The unit of the capacity, i.e., MB, GB, or TB.
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * The numeric value of the capacity.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaCapacity {
  
  @scala.inline
  def apply(): SchemaCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCapacity]
  }
  
  @scala.inline
  implicit class SchemaCapacityOps[Self <: SchemaCapacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
