package typingsSlinky.expoDashKeepDashAwake.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.expoDashKeepDashAwake.expoDashKeepDashAwakeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExpoDashKeepDashAwake
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("expo-keep-awake", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

