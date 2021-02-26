package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Glyph extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  
  var glyph: String = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var menu: js.UndefOr[ReactElement] = js.native
  
  var notificationCount: Double = js.native
}
object Glyph {
  
  @scala.inline
  def apply(glyph: String, notificationCount: Double): Glyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], notificationCount = notificationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
  
  @scala.inline
  implicit class GlyphMutableBuilder[Self <: Glyph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMenu(value: ReactElement): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuReactElement(value: ReactElement): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setNotificationCount(value: Double): Self = StObject.set(x, "notificationCount", value.asInstanceOf[js.Any])
  }
}
