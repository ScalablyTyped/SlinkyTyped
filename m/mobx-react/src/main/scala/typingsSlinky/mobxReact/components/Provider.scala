package typingsSlinky.mobxReact.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("mobx-react", "Provider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

