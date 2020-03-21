package typingsSlinky.reactNativeKeepAwake.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeKeepAwake.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeKeepAwake
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-keep-awake", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

