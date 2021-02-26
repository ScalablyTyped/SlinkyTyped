package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.`var`
import typingsSlinky.babelTraverse.babelTraverseStrings.const
import typingsSlinky.babelTraverse.babelTraverseStrings.let
import typingsSlinky.babelTraverse.mod.Binding
import typingsSlinky.babelTraverse.mod.NodePath
import typingsSlinky.babelTraverse.mod.Scope
import typingsSlinky.babelTypes.mod.Identifier_
import typingsSlinky.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Existing extends StObject {
  
  var existing: Binding = js.native
  
  var identifier: Identifier_ = js.native
  
  var kind: `var` | let | const = js.native
  
  var path: NodePath[Node] = js.native
  
  var scope: Scope = js.native
}
object Existing {
  
  @scala.inline
  def apply(
    existing: Binding,
    identifier: Identifier_,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): Existing = {
    val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Existing]
  }
  
  @scala.inline
  implicit class ExistingMutableBuilder[Self <: Existing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExisting(value: Binding): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: Identifier_): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: NodePath[Node]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
