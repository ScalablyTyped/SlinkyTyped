package typingsSlinky.reactNavigation.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigation.mod.NavigationProp
import typingsSlinky.reactNavigation.mod.SceneViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneView {
  
  @scala.inline
  def apply(component: ReactComponentClass[js.Object], navigation: NavigationProp[_], screenProps: js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[SceneViewProps]))
  }
  
  @JSImport("react-navigation", "SceneView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SceneViewProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
