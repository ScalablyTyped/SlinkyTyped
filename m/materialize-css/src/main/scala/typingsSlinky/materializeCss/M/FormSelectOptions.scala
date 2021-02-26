package typingsSlinky.materializeCss.M

import typingsSlinky.materializeCss.anon.PartialDropdownOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormSelectOptions extends StObject {
  
  /**
    * Classes to be added to the select wrapper element
    * @default ''
    */
  var classes: String = js.native
  
  /**
    * Pass options object to select dropdown initialization
    * @default {}
    */
  var dropdownOptions: PartialDropdownOptions = js.native
}
object FormSelectOptions {
  
  @scala.inline
  def apply(classes: String, dropdownOptions: PartialDropdownOptions): FormSelectOptions = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelectOptions]
  }
  
  @scala.inline
  implicit class FormSelectOptionsMutableBuilder[Self <: FormSelectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownOptions(value: PartialDropdownOptions): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
  }
}
