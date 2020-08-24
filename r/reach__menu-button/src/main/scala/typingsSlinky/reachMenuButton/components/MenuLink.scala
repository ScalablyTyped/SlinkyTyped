package typingsSlinky.reachMenuButton.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reachMenuButton.mod.MenuLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reachMenuButton.mod.MenuLinkProps[T] because: IArray(Could't extract props from T because couldn't resolve ClassTree., Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object MenuLink {
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: js.Object */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[/* <: js.Object */ T](p: MenuLinkProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: js.Object */ T](companion: MenuLink.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

