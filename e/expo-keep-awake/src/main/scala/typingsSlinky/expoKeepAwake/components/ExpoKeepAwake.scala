package typingsSlinky.expoKeepAwake.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.expoKeepAwake.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExpoKeepAwake
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("expo-keep-awake", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

