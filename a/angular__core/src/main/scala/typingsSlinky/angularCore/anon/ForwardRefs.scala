package typingsSlinky.angularCore.anon

import typingsSlinky.std.Set
import typingsSlinky.typescript.mod.AsExpression
import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.PropertyDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardRefs extends StObject {
  
  var forwardRefs: Set[typingsSlinky.typescript.mod.Identifier] = js.native
  
  var methodCalls: Set[CallExpression] = js.native
  
  var typedNodes: Set[ParameterDeclaration | AsExpression | PropertyDeclaration] = js.native
}
object ForwardRefs {
  
  @scala.inline
  def apply(
    forwardRefs: Set[typingsSlinky.typescript.mod.Identifier],
    methodCalls: Set[CallExpression],
    typedNodes: Set[ParameterDeclaration | AsExpression | PropertyDeclaration]
  ): ForwardRefs = {
    val __obj = js.Dynamic.literal(forwardRefs = forwardRefs.asInstanceOf[js.Any], methodCalls = methodCalls.asInstanceOf[js.Any], typedNodes = typedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRefs]
  }
  
  @scala.inline
  implicit class ForwardRefsMutableBuilder[Self <: ForwardRefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardRefs(value: Set[typingsSlinky.typescript.mod.Identifier]): Self = StObject.set(x, "forwardRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodCalls(value: Set[CallExpression]): Self = StObject.set(x, "methodCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedNodes(value: Set[ParameterDeclaration | AsExpression | PropertyDeclaration]): Self = StObject.set(x, "typedNodes", value.asInstanceOf[js.Any])
  }
}
