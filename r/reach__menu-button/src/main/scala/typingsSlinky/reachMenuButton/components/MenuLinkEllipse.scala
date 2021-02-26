package typingsSlinky.reachMenuButton.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reachMenuButton.mod.MenuLinkProps
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.ellipse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reachMenuButton.mod.MenuLinkProps[typingsSlinky.reachMenuButton.reachMenuButtonStrings.ellipse] because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object MenuLinkEllipse {
  
  def apply(p: MenuLinkProps[ellipse]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@reach/menu-button", "MenuLink_ellipse")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuLinkEllipse.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
