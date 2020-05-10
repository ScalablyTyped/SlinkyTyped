package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.radioNativeMod.RadioNativeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Radio {
  @JSImport("antd-mobile-rn", "Radio")
  @js.native
  object component extends js.Object
  
  def withProps(p: RadioNativeProps): SharedBuilder_RadioNativeProps_282866953[typingsSlinky.antdMobileRn.mod.Radio] = new SharedBuilder_RadioNativeProps_282866953[typingsSlinky.antdMobileRn.mod.Radio](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Radio.type): SharedBuilder_RadioNativeProps_282866953[typingsSlinky.antdMobileRn.mod.Radio] = new SharedBuilder_RadioNativeProps_282866953[typingsSlinky.antdMobileRn.mod.Radio](js.Array(this.component, js.Dictionary.empty))()
}

