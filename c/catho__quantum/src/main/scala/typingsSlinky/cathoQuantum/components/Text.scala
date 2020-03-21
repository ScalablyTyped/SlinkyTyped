package typingsSlinky.cathoQuantum.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@catho/quantum/Skeleton", "default.Text")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

