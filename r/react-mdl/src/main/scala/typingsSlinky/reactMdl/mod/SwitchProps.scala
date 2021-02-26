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
trait SwitchProps
  extends HTMLProps[js.Any]
     with RippleComponent {
  
  @JSName("onChange")
  var onChange_SwitchProps: js.UndefOr[FormEventHandler[Switch]] = js.native
}
object SwitchProps {
  
  @scala.inline
  def apply(): SwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with Switch, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
