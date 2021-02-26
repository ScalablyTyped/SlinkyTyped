package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.ImageOverlay_
import typingsSlinky.reactLeaflet.mod.ImageOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object ImageOverlay {
  
  def apply[P /* <: ImageOverlayProps */, E /* <: ImageOverlay_ */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "ImageOverlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P /* <: ImageOverlayProps */, E /* <: ImageOverlay_ */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.ImageOverlay[P, E]]
  
  implicit def make[P /* <: ImageOverlayProps */, E /* <: ImageOverlay_ */](companion: ImageOverlay.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
