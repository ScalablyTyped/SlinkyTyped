package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.flexNativeMod.FlexProps
import typingsSlinky.antdMobileRn.flexNativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlexDotnative {
  @JSImport("antd-mobile-rn/lib/flex/Flex.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FlexProps): SharedBuilder_FlexProps_1633308177[default] = new SharedBuilder_FlexProps_1633308177[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FlexDotnative.type): SharedBuilder_FlexProps_1633308177[default] = new SharedBuilder_FlexProps_1633308177[default](js.Array(this.component, js.Dictionary.empty))()
}

