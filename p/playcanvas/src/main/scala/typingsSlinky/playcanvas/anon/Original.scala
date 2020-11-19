package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Original extends js.Object {
  
  var load: String = js.native
  
  var original: String = js.native
}
object Original {
  
  @scala.inline
  def apply(load: String, original: String): Original = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[Original]
  }
  
  @scala.inline
  implicit class OriginalOps[Self <: Original] (val x: Self) extends AnyVal {
    
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
    def setLoad(value: String): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
  }
}
