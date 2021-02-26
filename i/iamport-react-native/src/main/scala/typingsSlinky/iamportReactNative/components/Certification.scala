package typingsSlinky.iamportReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.iamportReactNative.mod.CallbackRsp
import typingsSlinky.iamportReactNative.mod.CertificationData
import typingsSlinky.iamportReactNative.mod.CertificationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Certification {
  
  @scala.inline
  def apply(callback: CallbackRsp => Unit, data: CertificationData, userCode: String): Builder = {
    val __props = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CertificationProps]))
  }
  
  @JSImport("iamport-react-native", "default.Certification")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def loading(value: js.Object): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tierCode(value: String): this.type = set("tierCode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CertificationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
