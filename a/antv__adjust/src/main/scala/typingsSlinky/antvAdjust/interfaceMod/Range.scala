package typingsSlinky.antvAdjust.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends js.Object {
  
  var next: Double = js.native
  
  var pre: Double = js.native
}
object Range {
  
  @scala.inline
  def apply(next: Double, pre: Double): Range = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    
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
    def setNext(value: Double): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(value: Double): Self = this.set("pre", value.asInstanceOf[js.Any])
  }
}
