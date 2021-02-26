package typingsSlinky.postmanCollection.anon

import typingsSlinky.postmanCollection.mod.VariableList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variables extends StObject {
  
  var variables: VariableList = js.native
}
object Variables {
  
  @scala.inline
  def apply(variables: VariableList): Variables = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables]
  }
  
  @scala.inline
  implicit class VariablesMutableBuilder[Self <: Variables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariables(value: VariableList): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
