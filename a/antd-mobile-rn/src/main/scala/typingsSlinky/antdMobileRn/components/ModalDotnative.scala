package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.modalNativeMod.IModalNativeProps
import typingsSlinky.antdMobileRn.modalNativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalDotnative {
  
  @scala.inline
  def apply(visible: Boolean): SharedBuilder_IModalNativeProps2000388185[default] = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new SharedBuilder_IModalNativeProps2000388185[default](js.Array(this.component, __props.asInstanceOf[IModalNativeProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/modal/Modal.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IModalNativeProps): SharedBuilder_IModalNativeProps2000388185[default] = new SharedBuilder_IModalNativeProps2000388185[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
