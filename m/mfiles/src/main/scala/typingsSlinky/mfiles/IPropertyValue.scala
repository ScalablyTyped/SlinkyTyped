package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValue extends StObject {
  
  def Clone(): IPropertyValue = js.native
  
  def CloneFrom(PropertyValue: IPropertyValue): Unit = js.native
  
  def GetValueAsLocalizedText(): String = js.native
  
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String = js.native
  
  def GetValueAsUnlocalizedText(): String = js.native
  
  var PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  var TypedValue: ITypedValue = js.native
  
  var Value: ITypedValue = js.native
}
object IPropertyValue {
  
  @scala.inline
  def apply(
    Clone: () => IPropertyValue,
    CloneFrom: IPropertyValue => Unit,
    GetValueAsLocalizedText: () => String,
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String,
    GetValueAsUnlocalizedText: () => String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    TypedValue: ITypedValue,
    Value: ITypedValue
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), GetValueAsLocalizedText = js.Any.fromFunction0(GetValueAsLocalizedText), GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsUnlocalizedText = js.Any.fromFunction0(GetValueAsUnlocalizedText), PropertyDef = PropertyDef.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValue]
  }
  
  @scala.inline
  implicit class IPropertyValueMutableBuilder[Self <: IPropertyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyValue): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IPropertyValue => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueAsLocalizedText(value: () => String): Self = StObject.set(x, "GetValueAsLocalizedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueAsText(value: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String): Self = StObject.set(x, "GetValueAsText", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGetValueAsUnlocalizedText(value: () => String): Self = StObject.set(x, "GetValueAsUnlocalizedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedValue(value: ITypedValue): Self = StObject.set(x, "TypedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ITypedValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
