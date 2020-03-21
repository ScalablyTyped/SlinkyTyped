package typingsSlinky.cathoQuantum.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.cathoQuantum.globalStyleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GlobalStyle
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("@catho/quantum/GlobalStyle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

