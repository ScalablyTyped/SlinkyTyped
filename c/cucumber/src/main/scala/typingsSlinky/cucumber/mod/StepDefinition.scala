package typingsSlinky.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDefinition extends StObject {
  
  // tslint:disable:ban-types
  var code: js.Function = js.native
  
  // tslint:enable:ban-types
  var line: Double = js.native
  
  var pattern: js.Any = js.native
  
  var unwrappedCode: js.UndefOr[js.Function] = js.native
  
  var uri: String = js.native
}
object StepDefinition {
  
  @scala.inline
  def apply(code: js.Function, line: Double, pattern: js.Any, uri: String): StepDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinition]
  }
  
  @scala.inline
  implicit class StepDefinitionMutableBuilder[Self <: StepDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: js.Function): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: js.Any): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnwrappedCode(value: js.Function): Self = StObject.set(x, "unwrappedCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnwrappedCodeUndefined: Self = StObject.set(x, "unwrappedCode", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
