package typingsSlinky.materialUi.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.clearFixMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClearFix
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/internal/ClearFix", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

