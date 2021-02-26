package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.Control_.Layers
import typingsSlinky.reactLeaflet.mod.LayersControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object LayersControl {
  
  def apply[P /* <: LayersControlProps */, E /* <: Layers */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "LayersControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P /* <: LayersControlProps */, E /* <: Layers */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.LayersControl[P, E]]
  
  implicit def make[P /* <: LayersControlProps */, E /* <: Layers */](companion: LayersControl.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
