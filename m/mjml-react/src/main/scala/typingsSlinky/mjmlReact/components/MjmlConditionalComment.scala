package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.mjmlReact.AnonCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlConditionalComment {
  @JSImport("mjml-react/extensions", "MjmlConditionalComment")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonCondition): Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment] = new Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(condition: String): Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment] = {
    val __props = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment](js.Array(this.component, __props.asInstanceOf[AnonCondition]))
  }
}

