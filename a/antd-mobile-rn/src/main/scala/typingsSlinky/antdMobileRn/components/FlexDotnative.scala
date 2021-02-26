package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.flexNativeMod.FlexProps
import typingsSlinky.antdMobileRn.flexNativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlexDotnative {
  
  @JSImport("antd-mobile-rn/lib/flex/Flex.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FlexDotnative.type): SharedBuilder_FlexProps_1633308177[default] = new SharedBuilder_FlexProps_1633308177[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlexProps): SharedBuilder_FlexProps_1633308177[default] = new SharedBuilder_FlexProps_1633308177[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
