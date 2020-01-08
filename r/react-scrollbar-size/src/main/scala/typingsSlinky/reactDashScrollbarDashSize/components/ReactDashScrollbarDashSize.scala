package typingsSlinky.reactDashScrollbarDashSize.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashScrollbarDashSize.reactDashScrollbarDashSizeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashScrollbarDashSize
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-scrollbar-size", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

