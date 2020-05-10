package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.mjmlReact.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlClass {
  @JSImport("mjml-react", "MjmlClass")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonName): Default[tag.type, typingsSlinky.mjmlReact.mod.MjmlClass] = new Default[tag.type, typingsSlinky.mjmlReact.mod.MjmlClass](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): Default[tag.type, typingsSlinky.mjmlReact.mod.MjmlClass] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.mjmlReact.mod.MjmlClass](js.Array(this.component, __props.asInstanceOf[AnonName]))
  }
}

