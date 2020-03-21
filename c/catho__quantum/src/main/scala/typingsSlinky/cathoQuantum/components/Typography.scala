package typingsSlinky.cathoQuantum.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Typography
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@catho/quantum/GlobalStyle", "Typography")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

