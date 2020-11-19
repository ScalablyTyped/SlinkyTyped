package typingsSlinky.gliderJs.anon

import typingsSlinky.gliderJs.gliderJsStrings.arrow
import typingsSlinky.gliderJs.gliderJsStrings.dot
import typingsSlinky.gliderJs.gliderJsStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends js.Object {
  
  var `type`: arrow | dot | slide = js.native
  
  var value: String | Double = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: arrow | dot | slide, value: String | Double): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    
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
    def setType(value: arrow | dot | slide): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
