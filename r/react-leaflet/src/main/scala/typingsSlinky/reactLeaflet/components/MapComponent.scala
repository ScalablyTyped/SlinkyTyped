package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.Evented
import typingsSlinky.reactLeaflet.mod.MapComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object MapComponent {
  @JSImport("react-leaflet", "MapComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: MapComponentProps, E <: Evented] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.MapComponent[js.Any, js.Any]]
  
  def apply[P <: MapComponentProps, E <: Evented](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: MapComponentProps, E <: Evented](companion: MapComponent.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

