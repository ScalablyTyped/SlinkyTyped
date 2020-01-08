package typingsSlinky.baseui.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NestedMenus
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, typingsSlinky.baseui.menuMod.NestedMenus] {
  @JSImport("baseui/menu", "NestedMenus")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

