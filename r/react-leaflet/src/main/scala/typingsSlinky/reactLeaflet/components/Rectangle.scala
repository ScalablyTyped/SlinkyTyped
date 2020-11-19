package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.Rectangle_
import typingsSlinky.reactLeaflet.mod.RectangleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Rectangle {
  
  @JSImport("react-leaflet", "Rectangle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P /* <: RectangleProps */, E /* <: Rectangle_[js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.Rectangle[P, E]]
  
  def apply[P /* <: RectangleProps */, E /* <: Rectangle_[js.Any] */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P /* <: RectangleProps */, E /* <: Rectangle_[js.Any] */](companion: Rectangle.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
