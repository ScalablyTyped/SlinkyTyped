package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.VideoOverlay_
import typingsSlinky.reactLeaflet.mod.VideoOverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object VideoOverlay {
  @JSImport("react-leaflet", "VideoOverlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: VideoOverlayProps, E <: VideoOverlay_] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.VideoOverlay[js.Any, js.Any]]
  
  def apply[P <: VideoOverlayProps, E <: VideoOverlay_](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: VideoOverlayProps, E <: VideoOverlay_](companion: VideoOverlay.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

