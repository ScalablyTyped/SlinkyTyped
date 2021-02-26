package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrichPutPolicy[T] extends Generic {
  
  var body: T = js.native
  
  var name: String = js.native
}
object EnrichPutPolicy {
  
  @scala.inline
  def apply[T](body: T, name: String): EnrichPutPolicy[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichPutPolicy[T]]
  }
  
  @scala.inline
  implicit class EnrichPutPolicyMutableBuilder[Self <: EnrichPutPolicy[_], T] (val x: Self with EnrichPutPolicy[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
