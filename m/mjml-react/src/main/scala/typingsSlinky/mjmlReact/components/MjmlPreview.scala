package typingsSlinky.mjmlReact.components

import typingsSlinky.mjmlReact.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlPreview {
  
  @scala.inline
  def apply(children: String): SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.mod.MjmlPreview] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.mod.MjmlPreview](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("mjml-react", "MjmlPreview")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.mod.MjmlPreview] = new SharedBuilder_Children_486447409[typingsSlinky.mjmlReact.mod.MjmlPreview](js.Array(this.component, p.asInstanceOf[js.Any]))
}
