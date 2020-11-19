package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.flexNativeMod.FlexProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("antd-mobile-rn", "Flex")
  @js.native
  object component extends js.Object
  
  def withProps(p: FlexProps): SharedBuilder_FlexProps_1633308177[typingsSlinky.antdMobileRn.mod.Flex] = new SharedBuilder_FlexProps_1633308177[typingsSlinky.antdMobileRn.mod.Flex](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Flex.type): SharedBuilder_FlexProps_1633308177[typingsSlinky.antdMobileRn.mod.Flex] = new SharedBuilder_FlexProps_1633308177[typingsSlinky.antdMobileRn.mod.Flex](js.Array(this.component, js.Dictionary.empty))()
}
