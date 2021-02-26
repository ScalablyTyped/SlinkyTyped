package typingsSlinky.ajv.mod

import typingsSlinky.ajv.ajvStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringFormatDefinition extends FormatDefinition {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var compare: js.UndefOr[js.Function2[/* data1 */ String, /* data2 */ String, Double]] = js.native
  
  var `type`: js.UndefOr[string] = js.native
  
  var validate: FormatValidator = js.native
}
object StringFormatDefinition {
  
  @scala.inline
  def apply(validate: FormatValidator): StringFormatDefinition = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormatDefinition]
  }
  
  @scala.inline
  implicit class StringFormatDefinitionMutableBuilder[Self <: StringFormatDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setCompare(value: (/* data1 */ String, /* data2 */ String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidate(value: FormatValidator): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateFunction1(value: /* data */ String => Boolean | js.Thenable[js.Any]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateRegExp(value: js.RegExp): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
