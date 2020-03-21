package typingsSlinky.antd.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.siderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sider
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/layout/Sider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

