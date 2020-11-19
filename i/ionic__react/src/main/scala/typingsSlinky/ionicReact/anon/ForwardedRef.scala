package typingsSlinky.ionicReact.anon

import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardedRef[OverlayType /* <: OverlayBase */] extends js.Object {
  
  var forwardedRef: js.UndefOr[ReactRef[OverlayType]] = js.native
}
object ForwardedRef {
  
  @scala.inline
  def apply[OverlayType /* <: OverlayBase */](): ForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef[OverlayType]]
  }
  
  @scala.inline
  implicit class ForwardedRefOps[Self <: ForwardedRef[_], OverlayType /* <: OverlayBase */] (val x: Self with ForwardedRef[OverlayType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForwardedRef(value: ReactRef[OverlayType]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
  }
}
