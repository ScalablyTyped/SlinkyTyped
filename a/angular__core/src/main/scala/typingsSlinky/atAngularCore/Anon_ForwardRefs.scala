package typingsSlinky.atAngularCore

import typingsSlinky.std.Set
import typingsSlinky.typescript.typescriptMod.AsExpression
import typingsSlinky.typescript.typescriptMod.CallExpression
import typingsSlinky.typescript.typescriptMod.Identifier
import typingsSlinky.typescript.typescriptMod.ParameterDeclaration
import typingsSlinky.typescript.typescriptMod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardRefs extends js.Object {
  var forwardRefs: Set[Identifier]
  var methodCalls: Set[CallExpression]
  var typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
}

object Anon_ForwardRefs {
  @scala.inline
  def apply(
    forwardRefs: Set[Identifier],
    methodCalls: Set[CallExpression],
    typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
  ): Anon_ForwardRefs = {
    val __obj = js.Dynamic.literal(forwardRefs = forwardRefs.asInstanceOf[js.Any], methodCalls = methodCalls.asInstanceOf[js.Any], typedNodes = typedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ForwardRefs]
  }
}

