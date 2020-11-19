package typingsSlinky.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpec extends js.Object {
  
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
  implicit class RouteSpecOps[Self <: RouteSpec] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathRegExp(value: js.RegExp): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String | js.RegExp): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[String]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
}
