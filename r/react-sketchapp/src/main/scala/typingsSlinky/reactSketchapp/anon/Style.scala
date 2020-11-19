package typingsSlinky.reactSketchapp.anon

import typingsSlinky.reactSketchapp.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends js.Object {
  
  var style: typingsSlinky.reactSketchapp.mod.Style | TextStyle = js.native
}
object Style {
  
  @scala.inline
  def apply(style: typingsSlinky.reactSketchapp.mod.Style | TextStyle): Style = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: typingsSlinky.reactSketchapp.mod.Style | TextStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
