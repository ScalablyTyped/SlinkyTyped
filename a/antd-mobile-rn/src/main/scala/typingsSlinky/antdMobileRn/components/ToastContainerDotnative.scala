package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.toastContainerNativeMod.ToastProps
import typingsSlinky.antdMobileRn.toastContainerNativeMod.default
import typingsSlinky.antdMobileRn.toastStyleIndexNativeMod.IToastStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastContainerDotnative {
  @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
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
    def styles(value: IToastStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(content: String): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToastProps]))
  }
}

