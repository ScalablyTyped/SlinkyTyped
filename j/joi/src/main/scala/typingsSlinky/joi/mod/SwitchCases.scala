package typingsSlinky.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchCases extends StObject {
  
  /**
    * the required condition joi type.
    */
  var is: SchemaLike = js.native
  
  /**
    * the alternative schema type if the condition is true.
    */
  var `then`: SchemaLike = js.native
}
object SwitchCases {
  
  @scala.inline
  def apply(): SwitchCases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchCases]
  }
  
  @scala.inline
  implicit class SwitchCasesMutableBuilder[Self <: SwitchCases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs(value: SchemaLike): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNull: Self = StObject.set(x, "is", null)
    
    @scala.inline
    def setThen(value: SchemaLike): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThenNull: Self = StObject.set(x, "then", null)
  }
}
