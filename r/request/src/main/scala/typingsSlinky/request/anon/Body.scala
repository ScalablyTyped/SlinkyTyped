package typingsSlinky.request.anon

import typingsSlinky.request.mod.MultipartBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
  var body: MultipartBody = js.native
  
  var `content-type`: js.UndefOr[String] = js.native
}
object Body {
  
  @scala.inline
  def apply(body: MultipartBody): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
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
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: MultipartBody): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContent-type`(value: String): Self = this.set("content-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteContent-type`: Self = this.set("content-type", js.undefined)
  }
}
