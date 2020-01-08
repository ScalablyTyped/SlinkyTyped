package typingsSlinky.jsoneditorDashForDashReact.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.jsoneditorDashForDashReact.jsoneditorDashForDashReactMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object JsoneditorDashForDashReact
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("jsoneditor-for-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

