package typingsSlinky.eslint.eslintMod.Scope

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
import typingsSlinky.estree.estreeMod.Node
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var block: Node
  var childScopes: js.Array[typingsSlinky.eslint.eslintMod.Scope.Scope]
  var functionExpressionScope: Boolean
  var isStrict: Boolean
  var references: js.Array[Reference]
  var set: Map[String, Variable]
  var through: js.Array[Reference]
  var `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ
  var upper: typingsSlinky.eslint.eslintMod.Scope.Scope | Null
  var variableScope: typingsSlinky.eslint.eslintMod.Scope.Scope
  var variables: js.Array[Variable]
}

object Scope {
  @scala.inline
  def apply(
    block: Node,
    childScopes: js.Array[typingsSlinky.eslint.eslintMod.Scope.Scope],
    functionExpressionScope: Boolean,
    isStrict: Boolean,
    references: js.Array[Reference],
    set: Map[String, Variable],
    through: js.Array[Reference],
    `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ,
    variableScope: typingsSlinky.eslint.eslintMod.Scope.Scope,
    variables: js.Array[Variable],
    upper: typingsSlinky.eslint.eslintMod.Scope.Scope = null
  ): Scope = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], childScopes = childScopes.asInstanceOf[js.Any], functionExpressionScope = functionExpressionScope.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], through = through.asInstanceOf[js.Any], variableScope = variableScope.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

