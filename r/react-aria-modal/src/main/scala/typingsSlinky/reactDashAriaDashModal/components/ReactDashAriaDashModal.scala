package typingsSlinky.reactDashAriaDashModal.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalMod.AriaModalProps
import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalMod.RequiredAriaTypes
import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalMod.default
import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleId
import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleText
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object ReactDashAriaDashModal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-aria-modal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AriaModalProps with (RequiredAriaTypes[Pick[AriaModalProps, titleId], Pick[AriaModalProps, titleText]])
}

