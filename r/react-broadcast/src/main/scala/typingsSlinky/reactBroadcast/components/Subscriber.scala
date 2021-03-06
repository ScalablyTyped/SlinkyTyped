package typingsSlinky.reactBroadcast.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBroadcast.mod.Subscriber.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subscriber {
  
  @scala.inline
  def apply[T](channel: String): Builder[T] = {
    val __props = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("react-broadcast", "Subscriber")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBroadcast.mod.Subscriber[T]] {
    
    @scala.inline
    def children(value: T => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def quiet(value: Boolean): this.type = set("quiet", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
