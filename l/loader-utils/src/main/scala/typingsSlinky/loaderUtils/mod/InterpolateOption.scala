package typingsSlinky.loaderUtils.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolateOption extends js.Object {
  
  var content: js.UndefOr[String | Buffer] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var regExp: js.UndefOr[String | js.RegExp] = js.native
}
object InterpolateOption {
  
  @scala.inline
  def apply(): InterpolateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolateOption]
  }
  
  @scala.inline
  implicit class InterpolateOptionOps[Self <: InterpolateOption] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String | Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setRegExpRegExp(value: js.RegExp): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExp(value: String | js.RegExp): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
  }
}
