package typingsSlinky.activexInterop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Automation date (VT_DATE) */
@js.native
trait VarDate extends js.Object {
  
  var VarDate_typekey: VarDate = js.native
}
object VarDate {
  
  @scala.inline
  def apply(VarDate_typekey: VarDate): VarDate = {
    val __obj = js.Dynamic.literal(VarDate_typekey = VarDate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VarDate]
  }
  
  @scala.inline
  implicit class VarDateOps[Self <: VarDate] (val x: Self) extends AnyVal {
    
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
    def setVarDate_typekey(value: VarDate): Self = this.set("VarDate_typekey", value.asInstanceOf[js.Any])
  }
}
