package typingsSlinky.apolloLinkHttpCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accept extends js.Object {
  
  var accept: String = js.native
  
  var `content-type`: String = js.native
}
object Accept {
  
  @scala.inline
  def apply(accept: String, `content-type`: String): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContent-type`(value: String): Self = this.set("content-type", value.asInstanceOf[js.Any])
  }
}
