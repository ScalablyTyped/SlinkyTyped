package typingsSlinky.bandagedbdBdapi.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BdApiModuleReactStrictMode
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@bandagedbd/bdapi", "BdApiModule.React.StrictMode")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

