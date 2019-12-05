package typingsSlinky.eslint.eslintMod.Scope

import typingsSlinky.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  var globalScope: typingsSlinky.eslint.eslintMod.Scope.Scope | Null = js.native
  var scopes: js.Array[typingsSlinky.eslint.eslintMod.Scope.Scope] = js.native
  def acquire(node: Node): typingsSlinky.eslint.eslintMod.Scope.Scope | Null = js.native
  def acquire(node: Node, inner: Boolean): typingsSlinky.eslint.eslintMod.Scope.Scope | Null = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
}

