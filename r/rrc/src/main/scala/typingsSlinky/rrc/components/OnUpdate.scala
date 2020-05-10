package typingsSlinky.rrc.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.rrc.mod.OnUpdateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OnUpdate {
  @JSImport("rrc", "OnUpdate")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rrc.mod.OnUpdate] {
    @scala.inline
    def immediate(value: Boolean): this.type = set("immediate", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OnUpdateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(call: /* location */ Location[LocationState] => Unit): Builder = {
    val __props = js.Dynamic.literal(call = js.Any.fromFunction1(call))
    new Builder(js.Array(this.component, __props.asInstanceOf[OnUpdateProps]))
  }
}

