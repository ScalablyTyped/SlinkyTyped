package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMapGl.mod.DraggableControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object DraggableControl {
  
  @JSImport("react-map-gl", "DraggableControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: DraggableControlProps */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.DraggableControl[T]]
  
  def apply[T /* <: DraggableControlProps */](p: T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[T /* <: DraggableControlProps */](companion: DraggableControl.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
