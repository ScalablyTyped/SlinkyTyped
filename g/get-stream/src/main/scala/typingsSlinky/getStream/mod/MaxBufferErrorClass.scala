package typingsSlinky.getStream.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxBufferErrorClass extends Error {
  
  @JSName("name")
  val name_MaxBufferErrorClass: typingsSlinky.getStream.getStreamStrings.MaxBufferError = js.native
}
object MaxBufferErrorClass {
  
  @scala.inline
  def apply(message: String, name: typingsSlinky.getStream.getStreamStrings.MaxBufferError): MaxBufferErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxBufferErrorClass]
  }
  
  @scala.inline
  implicit class MaxBufferErrorClassOps[Self <: MaxBufferErrorClass] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.getStream.getStreamStrings.MaxBufferError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
