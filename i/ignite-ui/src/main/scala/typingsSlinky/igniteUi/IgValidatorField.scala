package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgValidatorField
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets the target element (input or control target) to be validated. This field setting is required.
    *
    *
    * Valid values:
    * "string" A valid jQuery selector for the element
    * "object" A reference to a jQuery object
    */
  var selector: js.UndefOr[String | js.Object] = js.native
}
object IgValidatorField {
  
  @scala.inline
  def apply(): IgValidatorField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgValidatorField]
  }
  
  @scala.inline
  implicit class IgValidatorFieldMutableBuilder[Self <: IgValidatorField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelector(value: String | js.Object): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
