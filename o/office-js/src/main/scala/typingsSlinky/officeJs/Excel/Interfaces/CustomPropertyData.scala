package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.DocumentPropertyType
import typingsSlinky.officeJs.officeJsStrings.Boolean
import typingsSlinky.officeJs.officeJsStrings.Date
import typingsSlinky.officeJs.officeJsStrings.Float
import typingsSlinky.officeJs.officeJsStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customProperty.toJSON()`. */
@js.native
trait CustomPropertyData extends StObject {
  
  /**
    *
    * The key of the custom property. The key is limited to 255 characters outside of Excel on the web (larger keys are automatically trimmed to 255 characters on other platforms).
    *
    * [Api set: ExcelApi 1.7]
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    *
    * The type of the value used for the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    DocumentPropertyType | Number | Boolean | Date | typingsSlinky.officeJs.officeJsStrings.String | Float
  ] = js.native
  
  /**
    *
    * The value of the custom property. The value is limited to 255 characters outside of Excel on the web (larger values are automatically trimmed to 255 characters on other platforms).
    *
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[js.Any] = js.native
}
object CustomPropertyData {
  
  @scala.inline
  def apply(): CustomPropertyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyData]
  }
  
  @scala.inline
  implicit class CustomPropertyDataMutableBuilder[Self <: CustomPropertyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(
      value: DocumentPropertyType | Number | Boolean | Date | typingsSlinky.officeJs.officeJsStrings.String | Float
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
