package typingsSlinky.eslint.mod.Scope

import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeManager extends js.Object {
  
  def acquire(node: Node): typingsSlinky.eslint.mod.Scope.Scope | Null = js.native
  def acquire(node: Node, inner: Boolean): typingsSlinky.eslint.mod.Scope.Scope | Null = js.native
  
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
  
  var globalScope: typingsSlinky.eslint.mod.Scope.Scope | Null = js.native
  
  var scopes: js.Array[typingsSlinky.eslint.mod.Scope.Scope] = js.native
}
