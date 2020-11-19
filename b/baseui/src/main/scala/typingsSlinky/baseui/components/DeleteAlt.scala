package typingsSlinky.baseui.components

import typingsSlinky.baseui.iconMod.IconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeleteAlt {
  
  @JSImport("baseui/icon", "DeleteAlt")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps_510117459 = new SharedBuilder_IconProps_510117459(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DeleteAlt.type): SharedBuilder_IconProps_510117459 = new SharedBuilder_IconProps_510117459(js.Array(this.component, js.Dictionary.empty))()
}
