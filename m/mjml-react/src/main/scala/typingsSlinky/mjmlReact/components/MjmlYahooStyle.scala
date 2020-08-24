package typingsSlinky.mjmlReact.components

import typingsSlinky.mjmlReact.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlYahooStyle {
  @JSImport("mjml-react/extensions", "MjmlYahooStyle")
  @js.native
  object component extends js.Object
  
  def withProps(p: Children): SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.extensionsMod.MjmlYahooStyle] = new SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.extensionsMod.MjmlYahooStyle](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: String): SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.extensionsMod.MjmlYahooStyle] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.extensionsMod.MjmlYahooStyle](js.Array(this.component, __props.asInstanceOf[Children]))
  }
}

