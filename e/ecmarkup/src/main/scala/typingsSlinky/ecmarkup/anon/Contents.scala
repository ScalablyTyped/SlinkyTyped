package typingsSlinky.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contents extends js.Object {
  
  var contents: String = js.native
  
  var element: org.scalajs.dom.raw.Element = js.native
}
object Contents {
  
  @scala.inline
  def apply(contents: String, element: org.scalajs.dom.raw.Element): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  @scala.inline
  implicit class ContentsOps[Self <: Contents] (val x: Self) extends AnyVal {
    
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
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = this.set("element", value.asInstanceOf[js.Any])
  }
}
