package typingsSlinky.reactDashNativeDashKeepDashAwake.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashKeepDashAwake.reactDashNativeDashKeepDashAwakeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashKeepDashAwake
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-keep-awake", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

