package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.GeoJSON_
import typingsSlinky.reactLeaflet.mod.GeoJSONProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object GeoJSON {
  
  @JSImport("react-leaflet", "GeoJSON")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P /* <: GeoJSONProps */, E /* <: GeoJSON_[js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.GeoJSON[P, E]]
  
  def apply[P /* <: GeoJSONProps */, E /* <: GeoJSON_[js.Any] */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P /* <: GeoJSONProps */, E /* <: GeoJSON_[js.Any] */](companion: GeoJSON.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
