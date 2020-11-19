package typingsSlinky.eslint.mod.Scope

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scope extends js.Object {
  
  var block: Node = js.native
  
  var childScopes: js.Array[typingsSlinky.eslint.mod.Scope.Scope] = js.native
  
  var functionExpressionScope: Boolean = js.native
  
  var isStrict: Boolean = js.native
  
  var references: js.Array[Reference] = js.native
  
  var set: Map[String, Variable] = js.native
  
  var through: js.Array[Reference] = js.native
  
  var `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ = js.native
  
  var upper: typingsSlinky.eslint.mod.Scope.Scope | Null = js.native
  
  var variableScope: typingsSlinky.eslint.mod.Scope.Scope = js.native
  
  var variables: js.Array[Variable] = js.native
}
object Scope {
  
  @scala.inline
  def apply(
    block: Node,
    childScopes: js.Array[typingsSlinky.eslint.mod.Scope.Scope],
    functionExpressionScope: Boolean,
    isStrict: Boolean,
    references: js.Array[Reference],
    set: Map[String, Variable],
    through: js.Array[Reference],
    `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ,
    variableScope: typingsSlinky.eslint.mod.Scope.Scope,
    variables: js.Array[Variable]
  ): Scope = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], childScopes = childScopes.asInstanceOf[js.Any], functionExpressionScope = functionExpressionScope.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], through = through.asInstanceOf[js.Any], variableScope = variableScope.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit class ScopeOps[Self <: typingsSlinky.eslint.mod.Scope.Scope] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: Node): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildScopesVarargs(value: typingsSlinky.eslint.mod.Scope.Scope*): Self = this.set("childScopes", js.Array(value :_*))
    
    @scala.inline
    def setChildScopes(value: js.Array[typingsSlinky.eslint.mod.Scope.Scope]): Self = this.set("childScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionExpressionScope(value: Boolean): Self = this.set("functionExpressionScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStrict(value: Boolean): Self = this.set("isStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesVarargs(value: Reference*): Self = this.set("references", js.Array(value :_*))
    
    @scala.inline
    def setReferences(value: js.Array[Reference]): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: Map[String, Variable]): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThroughVarargs(value: Reference*): Self = this.set("through", js.Array(value :_*))
    
    @scala.inline
    def setThrough(value: js.Array[Reference]): Self = this.set("through", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableScope(value: typingsSlinky.eslint.mod.Scope.Scope): Self = this.set("variableScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[Variable]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper(value: typingsSlinky.eslint.mod.Scope.Scope): Self = this.set("upper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperNull: Self = this.set("upper", null)
  }
}
