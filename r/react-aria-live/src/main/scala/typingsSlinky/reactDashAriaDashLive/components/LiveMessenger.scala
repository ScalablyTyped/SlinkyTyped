package typingsSlinky.reactDashAriaDashLive.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LiveMessenger
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-aria-live", "LiveMessenger")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

