package typingsSlinky.algoliaTransporter.mod

import typingsSlinky.algoliaRequesterCommon.mod.MethodType
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  /**
    * If the response should persist on cache.
    */
  val cacheable: js.UndefOr[Boolean] = js.native
  
  /**
    * The data to transfer to the server.
    */
  val data: js.UndefOr[(Record[String, _]) | (js.Array[Record[String, _]])] = js.native
  
  /**
    * The method of the request. `GET`, etc.
    */
  val method: MethodType = js.native
  
  /**
    * The path of the request. i.e: `/1/indexes`.
    */
  val path: String = js.native
}
object Request {
  
  @scala.inline
  def apply(method: MethodType, path: String): Request = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    @scala.inline
    def setData(value: (Record[String, _]) | (js.Array[Record[String, _]])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (Record[String, js.Any])*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: MethodType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
