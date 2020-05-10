package typingsSlinky.conductorAnimate.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.conductorAnimate.mod.AnimatedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Animated {
  @JSImport("conductor-animate", "Animated")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.conductorAnimate.mod.Animated] {
    @scala.inline
    def additional(value: js.Object): this.type = set("additional", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnimatedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnimatedProps]))
  }
}

