package typingsSlinky.googleMapsReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.googleMapsReact.mod.MarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Marker {
  @JSImport("google-maps-react", "Marker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: MarkerProps, S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.googleMapsReact.mod.Marker[js.Any, js.Any]]
  
  def apply[P <: MarkerProps, S](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: MarkerProps, S](companion: Marker.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}

