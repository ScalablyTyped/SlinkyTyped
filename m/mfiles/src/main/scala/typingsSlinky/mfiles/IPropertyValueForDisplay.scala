package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import typingsSlinky.mfiles.MFiles.MFContentType
import typingsSlinky.mfiles.MFiles.MFDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValueForDisplay extends StObject {
  
  def Clone(): IPropertyValueForDisplay = js.native
  
  val ContentType: MFContentType = js.native
  
  val DataType: MFDataType = js.native
  
  val DisplayValue: String = js.native
  
  val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  val PropertyDefName: String = js.native
  
  val PropertyValue: IPropertyValue = js.native
  
  val ReadOnly: Boolean = js.native
}
object IPropertyValueForDisplay {
  
  @scala.inline
  def apply(
    Clone: () => IPropertyValueForDisplay,
    ContentType: MFContentType,
    DataType: MFDataType,
    DisplayValue: String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    PropertyDefName: String,
    PropertyValue: IPropertyValue,
    ReadOnly: Boolean
  ): IPropertyValueForDisplay = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], PropertyDefName = PropertyDefName.asInstanceOf[js.Any], PropertyValue = PropertyValue.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
  
  @scala.inline
  implicit class IPropertyValueForDisplayMutableBuilder[Self <: IPropertyValueForDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyValueForDisplay): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentType(value: MFContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "DisplayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDefName(value: String): Self = StObject.set(x, "PropertyDefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValue(value: IPropertyValue): Self = StObject.set(x, "PropertyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
  }
}
