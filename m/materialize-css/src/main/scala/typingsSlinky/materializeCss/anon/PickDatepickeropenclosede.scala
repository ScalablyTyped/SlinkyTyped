package typingsSlinky.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Datepicker, 'open' | 'close' | 'destroy'> */
@js.native
trait PickDatepickeropenclosede extends js.Object {
  
  var close: js.UndefOr[js.Any] = js.native
  
  var destroy: js.UndefOr[js.Any] = js.native
  
  var open: js.UndefOr[js.Any] = js.native
}
object PickDatepickeropenclosede {
  
  @scala.inline
  def apply(): PickDatepickeropenclosede = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDatepickeropenclosede]
  }
  
  @scala.inline
  implicit class PickDatepickeropenclosedeOps[Self <: PickDatepickeropenclosede] (val x: Self) extends AnyVal {
    
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
    def setClose(value: js.Any): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDestroy(value: js.Any): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setOpen(value: js.Any): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
}
