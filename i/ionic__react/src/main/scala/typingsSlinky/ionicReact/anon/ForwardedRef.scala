package typingsSlinky.ionicReact.anon

import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.createControllerComponentMod.OverlayBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardedRef[OverlayType /* <: OverlayBase */] extends StObject {
  
  var forwardedRef: js.UndefOr[ReactRef[OverlayType]] = js.native
}
object ForwardedRef {
  
  @scala.inline
  def apply[OverlayType /* <: OverlayBase */](): ForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef[OverlayType]]
  }
  
  @scala.inline
  implicit class ForwardedRefMutableBuilder[Self <: ForwardedRef[_], OverlayType /* <: OverlayBase */] (val x: Self with ForwardedRef[OverlayType]) extends AnyVal {
    
    @scala.inline
    def setForwardedRef(value: ReactRef[OverlayType]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
