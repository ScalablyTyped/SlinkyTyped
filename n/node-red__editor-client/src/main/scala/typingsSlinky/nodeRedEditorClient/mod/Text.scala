package typingsSlinky.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text extends js.Object {
  
  var bidi: TextBidi = js.native
  
  var format: TextFormat = js.native
}
object Text {
  
  @scala.inline
  def apply(bidi: TextBidi, format: TextFormat): Text = {
    val __obj = js.Dynamic.literal(bidi = bidi.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
    
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
    def setBidi(value: TextBidi): Self = this.set("bidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TextFormat): Self = this.set("format", value.asInstanceOf[js.Any])
  }
}
