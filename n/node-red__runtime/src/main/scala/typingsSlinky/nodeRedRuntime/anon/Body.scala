package typingsSlinky.nodeRedRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
  var body: String = js.native
  
  var library: String = js.native
  
  var meta: js.Object = js.native
  
  var path: String = js.native
  
  var req: js.UndefOr[js.Object] = js.native
  
  var `type`: String = js.native
}
object Body {
  
  @scala.inline
  def apply(body: String, library: String, meta: js.Object, path: String, `type`: String): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibrary(value: String): Self = this.set("library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
  }
}
