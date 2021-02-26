package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait IfStatement_
  extends Conditional
     with BaseNode
     with Statement {
  
  var alternate: Statement | Null = js.native
  
  var consequent: Statement = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_IfStatement_ : IfStatement = js.native
}
object IfStatement_ {
  
  @scala.inline
  def apply(consequent: Statement, test: Expression, `type`: IfStatement): IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement_]
  }
  
  @scala.inline
  implicit class IfStatement_MutableBuilder[Self <: IfStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: Statement): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    @scala.inline
    def setConsequent(value: Statement): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
