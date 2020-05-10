package typingsSlinky.reactBroadcast.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBroadcast.mod.Broadcast.Props
import typingsSlinky.reactBroadcast.mod.Broadcast_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Broadcast {
  @JSImport("react-broadcast", "Broadcast")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Broadcast_[js.Any]] {
    @scala.inline
    def compareValues(value: (T, T) => Boolean): this.type = set("compareValues", js.Any.fromFunction2(value))
  }
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](channel: String, value: T): Builder[T] = {
    val __props = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
}

