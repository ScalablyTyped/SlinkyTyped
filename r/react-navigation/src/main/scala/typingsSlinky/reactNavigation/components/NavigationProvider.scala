package typingsSlinky.reactNavigation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigation.anon.Value
import typingsSlinky.reactNavigation.mod.NavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationProvider {
  
  @scala.inline
  def apply(value: NavigationProp[_]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Value]))
  }
  
  @JSImport("react-navigation", "NavigationProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Value): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
