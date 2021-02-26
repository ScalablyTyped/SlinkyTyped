package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlPutFilter[T] extends Generic {
  
  var body: T = js.native
  
  var filter_id: String = js.native
}
object MlPutFilter {
  
  @scala.inline
  def apply[T](body: T, filter_id: String): MlPutFilter[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutFilter[T]]
  }
  
  @scala.inline
  implicit class MlPutFilterMutableBuilder[Self <: MlPutFilter[_], T] (val x: Self with MlPutFilter[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_id(value: String): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
  }
}
