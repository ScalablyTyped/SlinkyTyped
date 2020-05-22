package typingsSlinky.eslintScope.mod

import typingsSlinky.eslint.eslintStrings.TDZ
import typingsSlinky.eslint.eslintStrings.`catch`
import typingsSlinky.eslint.eslintStrings.`class`
import typingsSlinky.eslint.eslintStrings.`for`
import typingsSlinky.eslint.eslintStrings.`function-expression-name`
import typingsSlinky.eslint.eslintStrings.`with`
import typingsSlinky.eslint.eslintStrings.block
import typingsSlinky.eslint.eslintStrings.function
import typingsSlinky.eslint.eslintStrings.global
import typingsSlinky.eslint.eslintStrings.module
import typingsSlinky.eslint.eslintStrings.switch
import typingsSlinky.estree.mod.Node
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "Scope")
@js.native
class Scope ()
  extends typingsSlinky.eslint.mod.Scope.Scope {
  /* CompleteClass */
  override var block: Node = js.native
  /* CompleteClass */
  override var childScopes: js.Array[typingsSlinky.eslint.mod.Scope.Scope] = js.native
  /* CompleteClass */
  override var functionExpressionScope: Boolean = js.native
  /* CompleteClass */
  override var isStrict: Boolean = js.native
  /* CompleteClass */
  override var references: js.Array[typingsSlinky.eslint.mod.Scope.Reference] = js.native
  /* CompleteClass */
  override var set: Map[String, typingsSlinky.eslint.mod.Scope.Variable] = js.native
  /* CompleteClass */
  override var through: js.Array[typingsSlinky.eslint.mod.Scope.Reference] = js.native
  /* CompleteClass */
  override var `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ = js.native
  /* CompleteClass */
  override var upper: typingsSlinky.eslint.mod.Scope.Scope | Null = js.native
  /* CompleteClass */
  override var variableScope: typingsSlinky.eslint.mod.Scope.Scope = js.native
  /* CompleteClass */
  override var variables: js.Array[typingsSlinky.eslint.mod.Scope.Variable] = js.native
}

