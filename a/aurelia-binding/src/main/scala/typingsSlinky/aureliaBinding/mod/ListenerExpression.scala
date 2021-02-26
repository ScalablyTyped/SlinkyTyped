package typingsSlinky.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerExpression extends StObject {
  
  def createBinding(target: js.Any): Binding = js.native
}
object ListenerExpression {
  
  @scala.inline
  def apply(createBinding: js.Any => Binding): ListenerExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[ListenerExpression]
  }
  
  @scala.inline
  implicit class ListenerExpressionMutableBuilder[Self <: ListenerExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateBinding(value: js.Any => Binding): Self = StObject.set(x, "createBinding", js.Any.fromFunction1(value))
  }
}
