package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.OptionSetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is MultiSelectOptionSet
  */
@js.native
trait MultiSelectOptionSetProperty extends Property {
  
  @JSName("attributes")
  var attributes_MultiSelectOptionSetProperty: js.UndefOr[OptionSetMetadata] = js.native
  
  @JSName("raw")
  var raw_MultiSelectOptionSetProperty: js.Array[Double] | Null = js.native
}
object MultiSelectOptionSetProperty {
  
  @scala.inline
  def apply(error: Boolean, errorMessage: String, `type`: String): MultiSelectOptionSetProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectOptionSetProperty]
  }
  
  @scala.inline
  implicit class MultiSelectOptionSetPropertyOps[Self <: MultiSelectOptionSetProperty] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: OptionSetMetadata): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setRawVarargs(value: Double*): Self = this.set("raw", js.Array(value :_*))
    
    @scala.inline
    def setRaw(value: js.Array[Double]): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawNull: Self = this.set("raw", null)
  }
}
