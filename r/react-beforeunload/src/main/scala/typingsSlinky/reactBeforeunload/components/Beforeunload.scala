package typingsSlinky.reactBeforeunload.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactBeforeunload.AnonChildren
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Beforeunload {
  @JSImport("react-beforeunload", "Beforeunload")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonChildren): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event_ => js.UndefOr[String | Unit]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[AnonChildren]))
  }
}

