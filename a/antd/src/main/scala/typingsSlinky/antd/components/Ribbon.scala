package typingsSlinky.antd.components

import typingsSlinky.antd.ribbonMod.RibbonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ribbon {
  
  @JSImport("antd/lib/badge/Ribbon", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: RibbonProps): SharedBuilder_RibbonProps1687579282 = new SharedBuilder_RibbonProps1687579282(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Ribbon.type): SharedBuilder_RibbonProps1687579282 = new SharedBuilder_RibbonProps1687579282(js.Array(this.component, js.Dictionary.empty))()
}
