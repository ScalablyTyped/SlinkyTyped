package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.modalNativeMod.IModalNativeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("antd-mobile-rn", "Modal")
  @js.native
  object component extends js.Object
  
  def withProps(p: IModalNativeProps): SharedBuilder_IModalNativeProps2000388185[typingsSlinky.antdMobileRn.mod.Modal] = new SharedBuilder_IModalNativeProps2000388185[typingsSlinky.antdMobileRn.mod.Modal](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(visible: Boolean): SharedBuilder_IModalNativeProps2000388185[typingsSlinky.antdMobileRn.mod.Modal] = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new SharedBuilder_IModalNativeProps2000388185[typingsSlinky.antdMobileRn.mod.Modal](js.Array(this.component, __props.asInstanceOf[IModalNativeProps]))
  }
}
