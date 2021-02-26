package typingsSlinky.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedQuery extends StObject {
  
  var ast: js.Array[QueryAstNode] = js.native
  
  var bindVars: js.Array[String] = js.native
  
  var collections: js.Array[String] = js.native
  
  var parameters: js.Array[String] = js.native
  
  var parsed: Boolean = js.native
}
object ParsedQuery {
  
  @scala.inline
  def apply(
    ast: js.Array[QueryAstNode],
    bindVars: js.Array[String],
    collections: js.Array[String],
    parameters: js.Array[String],
    parsed: Boolean
  ): ParsedQuery = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], bindVars = bindVars.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedQuery]
  }
  
  @scala.inline
  implicit class ParsedQueryMutableBuilder[Self <: ParsedQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: js.Array[QueryAstNode]): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstVarargs(value: QueryAstNode*): Self = StObject.set(x, "ast", js.Array(value :_*))
    
    @scala.inline
    def setBindVars(value: js.Array[String]): Self = StObject.set(x, "bindVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindVarsVarargs(value: String*): Self = StObject.set(x, "bindVars", js.Array(value :_*))
    
    @scala.inline
    def setCollections(value: js.Array[String]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionsVarargs(value: String*): Self = StObject.set(x, "collections", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setParsed(value: Boolean): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
  }
}
