package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.messagePassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePassThroughLayout extends Layout {
  
  var `type`: messagePassThrough = js.native
}
object MessagePassThroughLayout {
  
  @scala.inline
  def apply(`type`: messagePassThrough): MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePassThroughLayout]
  }
  
  @scala.inline
  implicit class MessagePassThroughLayoutOps[Self <: MessagePassThroughLayout] (val x: Self) extends AnyVal {
    
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
    def setType(value: messagePassThrough): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
