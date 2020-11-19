package typingsSlinky.mjmlReact.components

import typingsSlinky.mjmlReact.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlComment {
  
  @JSImport("mjml-react/extensions", "MjmlComment")
  @js.native
  object component extends js.Object
  
  def withProps(p: Children): SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.extensionsMod.MjmlComment] = new SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.extensionsMod.MjmlComment](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: String): SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.extensionsMod.MjmlComment] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.extensionsMod.MjmlComment](js.Array(this.component, __props.asInstanceOf[Children]))
  }
}
