package typingsSlinky.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatternParams extends ErrorParameters {
  
  var pattern: String = js.native
}
object PatternParams {
  
  @scala.inline
  def apply(pattern: String): PatternParams = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternParams]
  }
  
  @scala.inline
  implicit class PatternParamsMutableBuilder[Self <: PatternParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
