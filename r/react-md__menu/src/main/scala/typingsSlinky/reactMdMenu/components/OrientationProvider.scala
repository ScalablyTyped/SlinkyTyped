package typingsSlinky.reactMdMenu.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMdMenu.orientationMod.MenuOrientation
import typingsSlinky.reactMdMenu.orientationMod.OrientationProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OrientationProvider {
  @JSImport("@react-md/menu/types/Orientation", "OrientationProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: OrientationProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(orientation: MenuOrientation): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[OrientationProviderProps]))
  }
}

