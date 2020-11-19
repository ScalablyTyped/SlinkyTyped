package typingsSlinky.reactJoyride.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  var back: js.UndefOr[ReactElement] = js.native
  
  var close: js.UndefOr[ReactElement] = js.native
  
  var last: js.UndefOr[ReactElement] = js.native
  
  var next: js.UndefOr[ReactElement] = js.native
  
  var open: js.UndefOr[ReactElement] = js.native
  
  var skip: js.UndefOr[ReactElement] = js.native
}
object Locale {
  
  @scala.inline
  def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    
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
    def setBackReactElement(value: ReactElement): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBack(value: ReactElement): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBack: Self = this.set("back", js.undefined)
    
    @scala.inline
    def setCloseReactElement(value: ReactElement): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: ReactElement): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setLastReactElement(value: ReactElement): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast(value: ReactElement): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setNextReactElement(value: ReactElement): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ReactElement): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setOpenReactElement(value: ReactElement): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: ReactElement): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setSkipReactElement(value: ReactElement): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: ReactElement): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
}
