package typingsSlinky.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpec extends StObject {
  
  var method: String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: String | js.RegExp = js.native
  
  var versions: js.UndefOr[js.Array[String]] = js.native
}
object RouteSpec {
  
  @scala.inline
  def apply(method: String, path: String | js.RegExp): RouteSpec = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpec]
  }
  
  @scala.inline
  implicit class RouteSpecMutableBuilder[Self <: RouteSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String | js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathRegExp(value: js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
