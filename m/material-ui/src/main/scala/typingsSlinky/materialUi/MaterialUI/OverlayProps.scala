package typingsSlinky.materialUi.MaterialUI

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayProps extends Props[Overlay] {
  
  var autoLockScrolling: js.UndefOr[Boolean] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var transitionEnabled: js.UndefOr[Boolean] = js.native
}
object OverlayProps {
  
  @scala.inline
  def apply(): OverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayProps]
  }
  
  @scala.inline
  implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLockScrolling(value: Boolean): Self = StObject.set(x, "autoLockScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLockScrollingUndefined: Self = StObject.set(x, "autoLockScrolling", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTransitionEnabled(value: Boolean): Self = StObject.set(x, "transitionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEnabledUndefined: Self = StObject.set(x, "transitionEnabled", js.undefined)
  }
}
