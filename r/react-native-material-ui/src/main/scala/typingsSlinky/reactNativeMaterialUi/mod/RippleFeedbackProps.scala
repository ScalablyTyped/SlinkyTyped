package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RippleFeedbackProps extends StObject {
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var children: ReactElement = js.native
  
  var color: js.UndefOr[String] = js.native
}
object RippleFeedbackProps {
  
  @scala.inline
  def apply(children: ReactElement): RippleFeedbackProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleFeedbackProps]
  }
  
  @scala.inline
  implicit class RippleFeedbackPropsMutableBuilder[Self <: RippleFeedbackProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
