package typingsSlinky.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonResultsAdapter extends StObject {
  
  def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  
  def extractResults(data: js.Object): js.Object = js.native
  
  def extractSaveResults(data: js.Object): js.Array[_] = js.native
  
  var name: String = js.native
  
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): typingsSlinky.breeze.anon.EntityType = js.native
}
object JsonResultsAdapter {
  
  @scala.inline
  def apply(
    extractKeyMappings: js.Object => js.Array[KeyMapping],
    extractResults: js.Object => js.Object,
    extractSaveResults: js.Object => js.Array[_],
    name: String,
    visitNode: (js.Object, QueryContext, NodeContext) => typingsSlinky.breeze.anon.EntityType
  ): JsonResultsAdapter = {
    val __obj = js.Dynamic.literal(extractKeyMappings = js.Any.fromFunction1(extractKeyMappings), extractResults = js.Any.fromFunction1(extractResults), extractSaveResults = js.Any.fromFunction1(extractSaveResults), name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    __obj.asInstanceOf[JsonResultsAdapter]
  }
  
  @scala.inline
  implicit class JsonResultsAdapterMutableBuilder[Self <: JsonResultsAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtractKeyMappings(value: js.Object => js.Array[KeyMapping]): Self = StObject.set(x, "extractKeyMappings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtractResults(value: js.Object => js.Object): Self = StObject.set(x, "extractResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtractSaveResults(value: js.Object => js.Array[_]): Self = StObject.set(x, "extractSaveResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitNode(value: (js.Object, QueryContext, NodeContext) => typingsSlinky.breeze.anon.EntityType): Self = StObject.set(x, "visitNode", js.Any.fromFunction3(value))
  }
}
