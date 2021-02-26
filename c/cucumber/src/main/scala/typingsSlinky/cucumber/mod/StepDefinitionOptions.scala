package typingsSlinky.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDefinitionOptions extends StObject {
  
  var timeout: js.UndefOr[Double] = js.native
  
  var wrapperOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object StepDefinitionOptions {
  
  @scala.inline
  def apply(): StepDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepDefinitionOptions]
  }
  
  @scala.inline
  implicit class StepDefinitionOptionsMutableBuilder[Self <: StepDefinitionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWrapperOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
  }
}
