package typingsSlinky.reactDashSpinner.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSpinner.reactDashSpinnerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashSpinner
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-spinner", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

