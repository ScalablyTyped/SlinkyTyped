package typingsSlinky.qlik.mod

import typingsSlinky.qlik.anon.QIsNum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variable extends StObject {
  
  var qContent: QIsNum = js.native
}
object Variable {
  
  @scala.inline
  def apply(qContent: QIsNum): Variable = {
    val __obj = js.Dynamic.literal(qContent = qContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  
  @scala.inline
  implicit class VariableMutableBuilder[Self <: Variable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQContent(value: QIsNum): Self = StObject.set(x, "qContent", value.asInstanceOf[js.Any])
  }
}
