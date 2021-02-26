package typingsSlinky.griddleReact.mod.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsToggleProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var text: js.UndefOr[js.Any] = js.native
}
object SettingsToggleProps {
  
  @scala.inline
  def apply(): SettingsToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsToggleProps]
  }
  
  @scala.inline
  implicit class SettingsTogglePropsMutableBuilder[Self <: SettingsToggleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
