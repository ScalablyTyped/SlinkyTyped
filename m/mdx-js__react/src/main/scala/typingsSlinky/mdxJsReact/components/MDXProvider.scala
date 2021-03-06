package typingsSlinky.mdxJsReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.mdxJsReact.mod.MDXProviderComponentsProp
import typingsSlinky.mdxJsReact.mod.MDXProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MDXProvider {
  
  @scala.inline
  def apply(components: MDXProviderComponentsProp): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MDXProviderProps]))
  }
  
  @JSImport("@mdx-js/react", "MDXProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MDXProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
