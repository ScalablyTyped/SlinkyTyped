package typingsSlinky.reactDataGrid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object SubMenu {
  
  def apply(p: js.Any): Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Menu.SubMenu
  ] = new Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Menu.SubMenu
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSGlobal("AdazzleReactDataGridPlugins.Menu.SubMenu")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SubMenu.type): Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Menu.SubMenu
  ] = new Default[
    tag.type, 
    typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Menu.SubMenu
  ](js.Array(this.component, js.Dictionary.empty))()
}
