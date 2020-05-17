package typingsSlinky.reachMenuButton.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reachMenuButton.mod.MenuLinkProps
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feSpotLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reachMenuButton.mod.MenuLinkProps[typingsSlinky.reachMenuButton.reachMenuButtonStrings.feSpotLight] because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object MenuLinkFeSpotLight {
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  object component extends js.Object
  
  def apply(p: MenuLinkProps[feSpotLight]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MenuLinkFeSpotLight.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

