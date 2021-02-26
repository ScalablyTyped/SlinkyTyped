package typingsSlinky.reactOnsenui.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ripple extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.native
  
  var ripple: js.UndefOr[Boolean] = js.native
}
object Ripple {
  
  @scala.inline
  def apply(): Ripple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ripple]
  }
  
  @scala.inline
  implicit class RippleMutableBuilder[Self <: Ripple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
  }
}
