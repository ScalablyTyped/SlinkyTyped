package typingsSlinky.materialUi.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.toolbarSeparatorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToolbarSeparator
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/Toolbar/ToolbarSeparator", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

