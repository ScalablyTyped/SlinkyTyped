package typingsSlinky.reactJsonschemaForm.mod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddButtonProps extends StObject {
  
  var className: String = js.native
  
  var disabled: Boolean = js.native
  
  def onClick(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
}
object AddButtonProps {
  
  @scala.inline
  def apply(className: String, disabled: Boolean, onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[AddButtonProps]
  }
  
  @scala.inline
  implicit class AddButtonPropsMutableBuilder[Self <: AddButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
  }
}
