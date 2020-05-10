package typingsSlinky.glReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReact.mod.BusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Bus {
  @JSImport("gl-react", "Bus")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReact.mod.Bus] {
    @scala.inline
    def uniform(value: String): this.type = set("uniform", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(index: Double): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BusProps]))
  }
}

