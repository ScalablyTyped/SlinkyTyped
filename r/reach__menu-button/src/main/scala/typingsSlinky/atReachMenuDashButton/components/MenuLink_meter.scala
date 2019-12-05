package typingsSlinky.atReachMenuDashButton.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachMenuDashButton.atReachMenuDashButtonMod.MenuLinkProps
import typingsSlinky.atReachMenuDashButton.atReachMenuDashButtonStrings.meter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atReachMenuDashButton), Name(atReachMenuDashButtonMod), Name(MenuLinkProps))) was not a @ScalaJSDefined trait */
object MenuLink_meter
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = MenuLinkProps[meter]
}

