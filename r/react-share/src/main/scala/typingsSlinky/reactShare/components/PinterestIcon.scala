package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.mod.IconComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PinterestIcon {
  
  @JSImport("react-share", "PinterestIcon")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconComponentProps): SharedBuilder_IconComponentProps_1792398978 = new SharedBuilder_IconComponentProps_1792398978(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PinterestIcon.type): SharedBuilder_IconComponentProps_1792398978 = new SharedBuilder_IconComponentProps_1792398978(js.Array(this.component, js.Dictionary.empty))()
}
