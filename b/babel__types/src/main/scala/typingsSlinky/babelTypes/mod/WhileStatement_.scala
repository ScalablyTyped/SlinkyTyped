package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait WhileStatement_
  extends BlockParent
     with BaseNode
     with Loop
     with Scopable
     with Statement
     with While {
  
  var body: Statement = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_WhileStatement_ : WhileStatement = js.native
}
object WhileStatement_ {
  
  @scala.inline
  def apply(body: Statement, test: Expression, `type`: WhileStatement): WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhileStatement_]
  }
  
  @scala.inline
  implicit class WhileStatement_Ops[Self <: WhileStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: Statement): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WhileStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
