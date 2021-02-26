package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionField extends StObject {
  
  /**
    * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
    */
  var Name: ExtensionFieldName = js.native
  
  /**
    * The value of the header to add. Must be less than 2048 characters, and must not contain newline characters ("\r" or "\n").
    */
  var Value: ExtensionFieldValue = js.native
}
object ExtensionField {
  
  @scala.inline
  def apply(Name: ExtensionFieldName, Value: ExtensionFieldValue): ExtensionField = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionField]
  }
  
  @scala.inline
  implicit class ExtensionFieldMutableBuilder[Self <: ExtensionField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ExtensionFieldName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ExtensionFieldValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
