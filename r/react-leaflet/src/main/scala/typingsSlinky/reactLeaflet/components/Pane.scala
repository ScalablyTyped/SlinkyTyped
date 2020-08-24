package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Pane {
  @JSImport("react-leaflet", "Pane")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactLeaflet.mod.PaneProps */ P, /* <: typingsSlinky.reactLeaflet.mod.PaneState */ S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.Pane[P, S]]
  
  def apply[/* <: typingsSlinky.reactLeaflet.mod.PaneProps */ P, /* <: typingsSlinky.reactLeaflet.mod.PaneState */ S](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reactLeaflet.mod.PaneProps */ P, /* <: typingsSlinky.reactLeaflet.mod.PaneState */ S](companion: Pane.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}

