package typingsSlinky.jsqubits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitsRange extends _SingleQubitOperatorTargetQubits {
  
  var from: Double = js.native
  
  var to: Double = js.native
}
object BitsRange {
  
  @scala.inline
  def apply(from: Double, to: Double): BitsRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitsRange]
  }
  
  @scala.inline
  implicit class BitsRangeOps[Self <: BitsRange] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
