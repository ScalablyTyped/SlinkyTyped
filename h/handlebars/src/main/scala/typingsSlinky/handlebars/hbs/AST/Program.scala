package typingsSlinky.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Program extends Node {
  
  var blockParams: js.Array[String] = js.native
  
  var body: js.Array[Statement] = js.native
}
object Program {
  
  @scala.inline
  def apply(blockParams: js.Array[String], body: js.Array[Statement], loc: SourceLocation, `type`: String): Program = {
    val __obj = js.Dynamic.literal(blockParams = blockParams.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
  
  @scala.inline
  implicit class ProgramMutableBuilder[Self <: Program] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockParams(value: js.Array[String]): Self = StObject.set(x, "blockParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockParamsVarargs(value: String*): Self = StObject.set(x, "blockParams", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
  }
}
