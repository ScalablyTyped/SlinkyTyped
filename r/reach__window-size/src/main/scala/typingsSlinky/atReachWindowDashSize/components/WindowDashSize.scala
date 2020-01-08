package typingsSlinky.atReachWindowDashSize.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WindowDashSize
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@reach/window-size", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

