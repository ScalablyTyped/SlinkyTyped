package typingsSlinky.antdDashMobile.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobile.libInputDashItemInputMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Input
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/input-item/Input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

