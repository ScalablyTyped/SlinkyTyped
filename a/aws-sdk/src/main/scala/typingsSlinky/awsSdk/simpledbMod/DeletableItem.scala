package typingsSlinky.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletableItem extends StObject {
  
  var Attributes: js.UndefOr[DeletableAttributeList] = js.native
  
  var Name: String = js.native
}
object DeletableItem {
  
  @scala.inline
  def apply(Name: String): DeletableItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletableItem]
  }
  
  @scala.inline
  implicit class DeletableItemMutableBuilder[Self <: DeletableItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: DeletableAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: DeletableAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
