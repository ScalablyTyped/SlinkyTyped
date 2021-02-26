package typingsSlinky.reactNativeQrcode.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeQrcode.mod.QRCodeProperties
import typingsSlinky.reactNativeQrcode.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeQrcode {
  
  @JSImport("react-native-qrcode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def bgColor(value: String): this.type = set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fgColor(value: String): this.type = set("fgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeQrcode.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: QRCodeProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
