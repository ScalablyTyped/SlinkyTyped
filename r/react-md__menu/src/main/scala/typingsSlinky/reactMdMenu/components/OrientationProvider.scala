package typingsSlinky.reactMdMenu.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMdMenu.orientationMod.MenuOrientation
import typingsSlinky.reactMdMenu.orientationMod.OrientationProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OrientationProvider {
  
  @scala.inline
  def apply(orientation: MenuOrientation): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[OrientationProviderProps]))
  }
  
  @JSImport("@react-md/menu/types/Orientation", "OrientationProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OrientationProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
