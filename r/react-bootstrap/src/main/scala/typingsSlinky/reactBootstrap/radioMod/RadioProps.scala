package typingsSlinky.reactBootstrap.radioMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.reactBootstrapStrings.error
import typingsSlinky.reactBootstrap.reactBootstrapStrings.success
import typingsSlinky.reactBootstrap.reactBootstrapStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioProps
  extends AllHTMLAttributes[Radio]
     with ClassAttributes[Radio] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.native
  
  var validationState: js.UndefOr[success | warning | error] = js.native
}
object RadioProps {
  
  @scala.inline
  def apply(): RadioProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioProps]
  }
  
  @scala.inline
  implicit class RadioPropsOps[Self <: RadioProps] (val x: Self) extends AnyVal {
    
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
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setInputRef(value: /* instance */ HTMLInputElement => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setValidationState(value: success | warning | error): Self = this.set("validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
  }
}
