package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.shadowPortalMod.ShadowPortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShadowPortal {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/ShadowPortal", "ShadowPortal")
  @js.native
  object component extends js.Object
  
  def withProps(p: ShadowPortalProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ShadowPortal.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
