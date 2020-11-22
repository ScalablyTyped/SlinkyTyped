package typingsSlinky.iamportReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.iamportReactNative.mod.CallbackRsp
import typingsSlinky.iamportReactNative.mod.PaymentData
import typingsSlinky.iamportReactNative.mod.PaymentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Payment {
  
  @JSImport("iamport-react-native", "default.Payment")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def handleInicisTrans(value: /* event */ js.Any => Unit): this.type = set("handleInicisTrans", js.Any.fromFunction1(value))
    
    @scala.inline
    def loading(value: js.Object): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def open3rdPartyApp(value: /* iamportUrl */ js.Any => Unit): this.type = set("open3rdPartyApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def tierCode(value: String): this.type = set("tierCode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaymentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(callback: CallbackRsp => Unit, data: PaymentData, userCode: String): Builder = {
    val __props = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaymentProps]))
  }
}
