package typingsSlinky.reactOnsenui.anon

import typingsSlinky.reactOnsenui.reactOnsenuiStrings.fade
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.lift
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsOpen extends StObject {
  
  var animation: js.UndefOr[fade | lift | none] = js.native
  
  var animationOptions: js.UndefOr[typingsSlinky.reactOnsenui.mod.AnimationOptions] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.native
}
object IsOpen {
  
  @scala.inline
  def apply(): IsOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsOpen]
  }
  
  @scala.inline
  implicit class IsOpenMutableBuilder[Self <: IsOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: fade | lift | none): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptions(value: typingsSlinky.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setOnDeviceBackButton(value: () => Unit): Self = StObject.set(x, "onDeviceBackButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDeviceBackButtonUndefined: Self = StObject.set(x, "onDeviceBackButton", js.undefined)
    
    @scala.inline
    def setOnPostHide(value: () => Unit): Self = StObject.set(x, "onPostHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPostHideUndefined: Self = StObject.set(x, "onPostHide", js.undefined)
    
    @scala.inline
    def setOnPostShow(value: () => Unit): Self = StObject.set(x, "onPostShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPostShowUndefined: Self = StObject.set(x, "onPostShow", js.undefined)
    
    @scala.inline
    def setOnPreHide(value: () => Unit): Self = StObject.set(x, "onPreHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPreHideUndefined: Self = StObject.set(x, "onPreHide", js.undefined)
    
    @scala.inline
    def setOnPreShow(value: () => Unit): Self = StObject.set(x, "onPreShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPreShowUndefined: Self = StObject.set(x, "onPreShow", js.undefined)
  }
}
