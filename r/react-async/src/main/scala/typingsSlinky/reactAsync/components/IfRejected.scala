package typingsSlinky.reactAsync.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAsync.AnonChildrenPersistState
import typingsSlinky.reactAsync.mod.AsyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IfRejected {
  @JSImport("react-async", "IfRejected")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def persist(value: Boolean): this.type = set("persist", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: AnonChildrenPersistState[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](state: AsyncState[T]): Builder[T] = {
    val __props = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[AnonChildrenPersistState[T]]))
  }
}

