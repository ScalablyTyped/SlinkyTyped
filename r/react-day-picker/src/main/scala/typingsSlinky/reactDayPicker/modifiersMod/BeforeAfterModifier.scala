package typingsSlinky.reactDayPicker.modifiersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeAfterModifier extends _Modifier {
  
  var after: js.Date = js.native
  
  var before: js.Date = js.native
}
object BeforeAfterModifier {
  
  @scala.inline
  def apply(after: js.Date, before: js.Date): BeforeAfterModifier = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeAfterModifier]
  }
  
  @scala.inline
  implicit class BeforeAfterModifierOps[Self <: BeforeAfterModifier] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: js.Date): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: js.Date): Self = this.set("before", value.asInstanceOf[js.Any])
  }
}
