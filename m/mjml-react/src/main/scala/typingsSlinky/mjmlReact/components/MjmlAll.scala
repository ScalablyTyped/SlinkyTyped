package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.mjmlReact.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlAll {
  @JSImport("mjml-react", "MjmlAll")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonDictkey): Default[tag.type, typingsSlinky.mjmlReact.mod.MjmlAll] = new Default[tag.type, typingsSlinky.mjmlReact.mod.MjmlAll](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MjmlAll.type): Default[tag.type, typingsSlinky.mjmlReact.mod.MjmlAll] = new Default[tag.type, typingsSlinky.mjmlReact.mod.MjmlAll](js.Array(this.component, js.Dictionary.empty))()
}

