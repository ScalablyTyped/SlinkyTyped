package typingsSlinky.antdMobileRn.androidContainerNativeMod

import typingsSlinky.antdMobileRn.styleIndexNativeMod.ActionSheetStyle
import typingsSlinky.reactNative.mod.ActionSheetIOSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheetNativeProps extends js.Object {
  
  var callback: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var config: ActionSheetIOSOptions = js.native
  
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var styles: js.UndefOr[ActionSheetStyle] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ActionSheetNativeProps {
  
  @scala.inline
  def apply(config: ActionSheetIOSOptions): ActionSheetNativeProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetNativeProps]
  }
  
  @scala.inline
  implicit class ActionSheetNativePropsOps[Self <: ActionSheetNativeProps] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ActionSheetIOSOptions): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: /* index */ Double => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setStyles(value: ActionSheetStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
