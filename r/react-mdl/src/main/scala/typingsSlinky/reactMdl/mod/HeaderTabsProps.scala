package typingsSlinky.reactMdl.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderTabsProps
  extends HTMLProps[js.Any]
     with RippleComponent {
  
  var activeTab: js.UndefOr[Double] = js.native
  
  @JSName("onChange")
  var onChange_HeaderTabsProps: js.UndefOr[FormEventHandler[Header]] = js.native
}
object HeaderTabsProps {
  
  @scala.inline
  def apply(): HeaderTabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderTabsProps]
  }
  
  @scala.inline
  implicit class HeaderTabsPropsMutableBuilder[Self <: HeaderTabsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with Header, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
