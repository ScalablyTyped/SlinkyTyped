package typingsSlinky.awsSdkTypes.eventStreamMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryHeaderValue extends MessageHeaderValue {
  
  var `type`: binary = js.native
  
  var value: js.typedarray.Uint8Array = js.native
}
object BinaryHeaderValue {
  
  @scala.inline
  def apply(`type`: binary, value: js.typedarray.Uint8Array): BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryHeaderValue]
  }
  
  @scala.inline
  implicit class BinaryHeaderValueOps[Self <: BinaryHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setType(value: binary): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.typedarray.Uint8Array): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
