package typingsSlinky.atReachAlertDashDialog.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachAlertDashDialog.atReachAlertDashDialogMod.AlertDialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atReachAlertDashDialog), Name(atReachAlertDashDialogMod), Name(AlertDialogProps))) was not a @ScalaJSDefined trait */
object AlertDialogOverlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@reach/alert-dialog", "AlertDialogOverlay")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AlertDialogProps
}

