package typingsSlinky.reactApp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactApp.mod.LayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layout {
  
  @scala.inline
  def apply(className: String): Default[tag.type, typingsSlinky.reactApp.mod.Layout] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactApp.mod.Layout](js.Array(this.component, __props.asInstanceOf[LayoutProps]))
  }
  
  @JSImport("react-app", "Layout")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LayoutProps): Default[tag.type, typingsSlinky.reactApp.mod.Layout] = new Default[tag.type, typingsSlinky.reactApp.mod.Layout](js.Array(this.component, p.asInstanceOf[js.Any]))
}
