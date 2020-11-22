package typingsSlinky.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/helper-text/adapter.MDCTextFieldHelperTextAdapter> */
@js.native
trait PartialMDCTextFieldHelper extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var getAttr: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var removeAttr: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
  
  var setContent: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
}
object PartialMDCTextFieldHelper {
  
  @scala.inline
  def apply(): PartialMDCTextFieldHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldHelper]
  }
  
  @scala.inline
  implicit class PartialMDCTextFieldHelperOps[Self <: PartialMDCTextFieldHelper] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setGetAttr(value: /* attr */ String => String | Null): Self = this.set("getAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAttr: Self = this.set("getAttr", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setRemoveAttr(value: /* attr */ String => Unit): Self = this.set("removeAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveAttr: Self = this.set("removeAttr", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetAttr: Self = this.set("setAttr", js.undefined)
    
    @scala.inline
    def setSetContent(value: /* content */ String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetContent: Self = this.set("setContent", js.undefined)
  }
}
