package typingsSlinky.reactDashLazylog.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLazylog.buildLoadingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Loading
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-lazylog/build/Loading", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

