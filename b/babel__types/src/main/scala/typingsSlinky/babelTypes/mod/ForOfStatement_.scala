package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait ForOfStatement_
  extends BlockParent
     with BaseNode
     with For
     with ForXStatement
     with Loop
     with Scopable
     with Statement {
  
  var await: Boolean = js.native
  
  var body: Statement = js.native
  
  var left: VariableDeclaration_ | LVal = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_ForOfStatement_ : ForOfStatement = js.native
}
object ForOfStatement_ {
  
  @scala.inline
  def apply(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration_ | LVal,
    right: Expression,
    `type`: ForOfStatement
  ): ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForOfStatement_]
  }
  
  @scala.inline
  implicit class ForOfStatement_MutableBuilder[Self <: ForOfStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: VariableDeclaration_ | LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
