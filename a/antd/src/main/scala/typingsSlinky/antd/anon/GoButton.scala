package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoButton extends StObject {
  
  var goButton: js.UndefOr[ReactElement] = js.native
}
object GoButton {
  
  @scala.inline
  def apply(): GoButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoButton]
  }
  
  @scala.inline
  implicit class GoButtonMutableBuilder[Self <: GoButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoButton(value: ReactElement): Self = StObject.set(x, "goButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoButtonReactElement(value: ReactElement): Self = StObject.set(x, "goButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoButtonUndefined: Self = StObject.set(x, "goButton", js.undefined)
  }
}
