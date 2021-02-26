package typingsSlinky.reactDates.anon

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClick extends StObject {
  
  var ariaLabel: String = js.native
  
  var onClick: MouseEventHandler[Element] = js.native
  
  var ref: Ref[HTMLElement] = js.native
}
object OnClick {
  
  @scala.inline
  def apply(ariaLabel: String, onClick: SyntheticMouseEvent[Element] => Unit): OnClick = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit class OnClickMutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
