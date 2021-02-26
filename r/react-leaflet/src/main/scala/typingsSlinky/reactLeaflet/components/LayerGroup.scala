package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.LayerGroup_
import typingsSlinky.reactLeaflet.mod.MapLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object LayerGroup {
  
  def apply[P /* <: MapLayerProps */, E /* <: LayerGroup_[js.Any] */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "LayerGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P /* <: MapLayerProps */, E /* <: LayerGroup_[js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.LayerGroup[P, E]]
  
  implicit def make[P /* <: MapLayerProps */, E /* <: LayerGroup_[js.Any] */](companion: LayerGroup.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
