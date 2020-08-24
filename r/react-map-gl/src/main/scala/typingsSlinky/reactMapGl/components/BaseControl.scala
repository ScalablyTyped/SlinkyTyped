package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object BaseControl {
  @JSImport("react-map-gl", "BaseControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactMapGl.mod.BaseControlProps */ T, /* <: typingsSlinky.std.Element */ S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.BaseControl[T, S]]
  
  def apply[/* <: typingsSlinky.reactMapGl.mod.BaseControlProps */ T, /* <: typingsSlinky.std.Element */ S](p: T): Builder[T, S] = new Builder[T, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reactMapGl.mod.BaseControlProps */ T, /* <: typingsSlinky.std.Element */ S](companion: BaseControl.type): Builder[T, S] = new Builder[T, S](js.Array(this.component, js.Dictionary.empty))()
}

