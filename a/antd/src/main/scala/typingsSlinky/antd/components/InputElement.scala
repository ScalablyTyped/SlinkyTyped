package typingsSlinky.antd.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libAutoDashCompleteInputElementMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputElement
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/auto-complete/InputElement", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

