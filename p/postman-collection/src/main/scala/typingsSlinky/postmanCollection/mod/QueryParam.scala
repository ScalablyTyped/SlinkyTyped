package typingsSlinky.postmanCollection.mod

import typingsSlinky.postmanCollection.anon.Encode
import typingsSlinky.postmanCollection.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.QueryParamDefinition because var conflicts: description, disabled, id, name. Inlined key, value, system */ @JSImport("postman-collection", "QueryParam")
@js.native
class QueryParam protected () extends Property[QueryParamDefinition] {
  def this(options: String) = this()
  def this(options: QueryParamDefinition) = this()
  
  var key: Null | String = js.native
  
  var system: js.UndefOr[Boolean] = js.native
  
  def update(param: String): Unit = js.native
  def update(param: Value): Unit = js.native
  
  var value: Null | String = js.native
}
/* static members */
object QueryParam {
  
  @JSImport("postman-collection", "QueryParam")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postman-collection", "QueryParam._postman_propertyAllowsMultipleValues")
  @js.native
  def _postman_propertyAllowsMultipleValues: Boolean = js.native
  @scala.inline
  def _postman_propertyAllowsMultipleValues_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_postman_propertyAllowsMultipleValues")(x.asInstanceOf[js.Any])
  
  @JSImport("postman-collection", "QueryParam._postman_propertyIndexKey")
  @js.native
  def _postman_propertyIndexKey: String = js.native
  @scala.inline
  def _postman_propertyIndexKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_postman_propertyIndexKey")(x.asInstanceOf[js.Any])
  
  @JSImport("postman-collection", "QueryParam.parse")
  @js.native
  def parse(query: String): js.Array[QueryParamDefinition] = js.native
  
  @JSImport("postman-collection", "QueryParam.parseSingle")
  @js.native
  def parseSingle(param: String, idx: Double, all: js.Array[String]): QueryParamDefinition = js.native
  
  @JSImport("postman-collection", "QueryParam.unparse")
  @js.native
  def unparse(params: js.Array[QueryParamDefinition]): String = js.native
  @JSImport("postman-collection", "QueryParam.unparse")
  @js.native
  def unparse(params: js.Array[QueryParamDefinition], options: Encode): String = js.native
  
  @JSImport("postman-collection", "QueryParam.unparseSingle")
  @js.native
  def unparseSingle(obj: QueryParamDefinition, encode: Boolean): String = js.native
}
