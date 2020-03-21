package typingsSlinky.reachMenuButton.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reachMenuButton.mod.MenuLinkProps
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reachMenuButton), Name(mod), Name(MenuLinkProps))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reachMenuButton), Name(reachMenuButtonStrings), Name(time))),IArray(),Comments(0))),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object MenuLinkTime
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MenuLinkProps[time]
}

