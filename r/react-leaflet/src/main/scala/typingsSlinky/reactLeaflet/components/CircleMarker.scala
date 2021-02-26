package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.CircleMarker_
import typingsSlinky.reactLeaflet.mod.CircleMarkerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object CircleMarker {
  
  def apply[P /* <: CircleMarkerProps */, E /* <: CircleMarker_[js.Any] */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "CircleMarker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P /* <: CircleMarkerProps */, E /* <: CircleMarker_[js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.CircleMarker[P, E]]
  
  implicit def make[P /* <: CircleMarkerProps */, E /* <: CircleMarker_[js.Any] */](companion: CircleMarker.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
