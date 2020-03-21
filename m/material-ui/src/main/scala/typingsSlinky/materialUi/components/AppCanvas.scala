package typingsSlinky.materialUi.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.appCanvasMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppCanvas
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/internal/AppCanvas", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

