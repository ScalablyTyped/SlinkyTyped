package typingsSlinky.muicss.reactMod

import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.react.mod.FormHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProps extends FormHTMLAttributes[HTMLFormElement] {
  
  var `inline`: js.UndefOr[Boolean] = js.native
}
object FormProps {
  
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  
  @scala.inline
  implicit class FormPropsMutableBuilder[Self <: FormProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
  }
}
