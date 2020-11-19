package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.mjmlReact.anon.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlConditionalComment {
  
  @JSImport("mjml-react/extensions", "MjmlConditionalComment")
  @js.native
  object component extends js.Object
  
  def withProps(p: Condition): Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment] = new Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: String, condition: String): Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment](js.Array(this.component, __props.asInstanceOf[Condition]))
  }
}
