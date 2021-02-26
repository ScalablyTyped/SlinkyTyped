package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.androidContainerNativeMod.ActionSheetNativeProps
import typingsSlinky.antdMobileRn.androidContainerNativeMod.default
import typingsSlinky.antdMobileRn.styleIndexNativeMod.ActionSheetStyle
import typingsSlinky.reactNative.mod.ActionSheetIOSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AndroidContainerDotnative {
  
  @scala.inline
  def apply(config: ActionSheetIOSOptions): Builder = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetNativeProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/action-sheet/AndroidContainer.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def callback(value: /* index */ Double => Unit): this.type = set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: ActionSheetStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionSheetNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
