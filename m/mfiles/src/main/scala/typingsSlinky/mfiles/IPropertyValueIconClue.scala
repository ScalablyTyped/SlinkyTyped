package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValueIconClue extends StObject {
  
  def Clone(): IPropertyValueIconClue = js.native
  
  val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  val ValueListItem: Double = js.native
}
object IPropertyValueIconClue {
  
  @scala.inline
  def apply(
    Clone: () => IPropertyValueIconClue,
    PropertyDef: MFBuiltInPropertyDef | Double,
    ValueListItem: Double
  ): IPropertyValueIconClue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], ValueListItem = ValueListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueIconClue]
  }
  
  @scala.inline
  implicit class IPropertyValueIconClueMutableBuilder[Self <: IPropertyValueIconClue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyValueIconClue): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListItem(value: Double): Self = StObject.set(x, "ValueListItem", value.asInstanceOf[js.Any])
  }
}
