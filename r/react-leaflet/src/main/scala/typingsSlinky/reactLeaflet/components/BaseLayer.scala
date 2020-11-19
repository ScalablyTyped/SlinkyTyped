package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLeaflet.mod.LayersControl.ControlledLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object BaseLayer {
  
  @JSImport("react-leaflet", "LayersControl.BaseLayer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P /* <: ControlledLayerProps */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.LayersControl.BaseLayer[P]]
  
  def apply[P /* <: ControlledLayerProps */](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P /* <: ControlledLayerProps */](companion: BaseLayer.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}
