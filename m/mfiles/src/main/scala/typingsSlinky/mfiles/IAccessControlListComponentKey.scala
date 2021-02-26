package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlListComponentKey extends StObject {
  
  def Clone(): IAccessControlListComponentKey = js.native
  
  var ItemID: Double = js.native
  
  var PropertyDefID: MFBuiltInPropertyDef | Double = js.native
}
object IAccessControlListComponentKey {
  
  @scala.inline
  def apply(
    Clone: () => IAccessControlListComponentKey,
    ItemID: Double,
    PropertyDefID: MFBuiltInPropertyDef | Double
  ): IAccessControlListComponentKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ItemID = ItemID.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlListComponentKey]
  }
  
  @scala.inline
  implicit class IAccessControlListComponentKeyMutableBuilder[Self <: IAccessControlListComponentKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IAccessControlListComponentKey): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemID(value: Double): Self = StObject.set(x, "ItemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDefID(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDefID", value.asInstanceOf[js.Any])
  }
}
