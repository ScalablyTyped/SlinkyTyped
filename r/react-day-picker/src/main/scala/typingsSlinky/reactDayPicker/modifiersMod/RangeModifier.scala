package typingsSlinky.reactDayPicker.modifiersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeModifier extends _Modifier {
  
  var from: js.Date = js.native
  
  var to: js.Date = js.native
}
object RangeModifier {
  
  @scala.inline
  def apply(from: js.Date, to: js.Date): RangeModifier = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeModifier]
  }
  
  @scala.inline
  implicit class RangeModifierOps[Self <: RangeModifier] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: js.Date): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Date): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
