package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  var file: js.Any = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object File {
  
  @scala.inline
  def apply(file: js.Any, originalEvent: org.scalajs.dom.raw.Event): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setFile(value: js.Any): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
  }
}
