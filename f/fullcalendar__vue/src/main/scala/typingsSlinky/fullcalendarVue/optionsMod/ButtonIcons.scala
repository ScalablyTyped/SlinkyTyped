package typingsSlinky.fullcalendarVue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonIcons extends js.Object {
  
  var next: js.UndefOr[String] = js.native
  
  var nextYear: js.UndefOr[String] = js.native
  
  var prev: js.UndefOr[String] = js.native
  
  var prevYear: js.UndefOr[String] = js.native
}
object ButtonIcons {
  
  @scala.inline
  def apply(): ButtonIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonIcons]
  }
  
  @scala.inline
  implicit class ButtonIconsOps[Self <: ButtonIcons] (val x: Self) extends AnyVal {
    
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
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setNextYear(value: String): Self = this.set("nextYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextYear: Self = this.set("nextYear", js.undefined)
    
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    
    @scala.inline
    def setPrevYear(value: String): Self = this.set("prevYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevYear: Self = this.set("prevYear", js.undefined)
  }
}
