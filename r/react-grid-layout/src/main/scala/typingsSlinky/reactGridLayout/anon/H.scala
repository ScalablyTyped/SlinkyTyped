package typingsSlinky.reactGridLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H extends js.Object {
  
  var h: Double = js.native
  
  var i: String = js.native
  
  var w: Double = js.native
}
object H {
  
  @scala.inline
  def apply(h: Double, i: String, w: Double): H = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  
  @scala.inline
  implicit class HOps[Self <: H] (val x: Self) extends AnyVal {
    
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI(value: String): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
  }
}
