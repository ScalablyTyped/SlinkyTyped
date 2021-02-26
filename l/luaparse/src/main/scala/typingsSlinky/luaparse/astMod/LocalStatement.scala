package typingsSlinky.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.LocalStatement] {
  
  var init: js.Array[Expression] = js.native
  
  var variables: js.Array[Identifier] = js.native
}
object LocalStatement {
  
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.LocalStatement,
    variables: js.Array[Identifier]
  ): LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStatement]
  }
  
  @scala.inline
  implicit class LocalStatementMutableBuilder[Self <: LocalStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: js.Array[Expression]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitVarargs(value: Expression*): Self = StObject.set(x, "init", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[Identifier]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: Identifier*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
