package typingsSlinky.atReachMenuDashButton.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@reach/menu-button", "Menu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

