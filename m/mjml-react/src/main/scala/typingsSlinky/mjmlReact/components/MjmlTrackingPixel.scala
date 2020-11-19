package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.mjmlReact.anon.Src
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlTrackingPixel {
  
  @JSImport("mjml-react/extensions", "MjmlTrackingPixel")
  @js.native
  object component extends js.Object
  
  def withProps(p: Src): Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlTrackingPixel] = new Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlTrackingPixel](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(src: String): Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlTrackingPixel] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlTrackingPixel](js.Array(this.component, __props.asInstanceOf[Src]))
  }
}
