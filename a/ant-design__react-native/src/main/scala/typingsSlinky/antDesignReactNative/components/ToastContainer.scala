package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.toastContainerMod.ToastProps
import typingsSlinky.antDesignReactNative.toastContainerMod.default
import typingsSlinky.antDesignReactNative.toastStyleMod.ToastStyle
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastContainer {
  
  @scala.inline
  def apply(content: String): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToastProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/toast/ToastContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationEnd(value: () => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def styles(value: Partial[ToastStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
