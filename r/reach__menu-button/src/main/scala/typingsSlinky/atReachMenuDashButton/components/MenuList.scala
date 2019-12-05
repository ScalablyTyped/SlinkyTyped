package typingsSlinky.atReachMenuDashButton.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachMenuDashButton.atReachMenuDashButtonMod.MenuListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atReachMenuDashButton), Name(atReachMenuDashButtonMod), Name(MenuListProps))) was not a @ScalaJSDefined trait */
object MenuList
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@reach/menu-button", "MenuList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MenuListProps
}

