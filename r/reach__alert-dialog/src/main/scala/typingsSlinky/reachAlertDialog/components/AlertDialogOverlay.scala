package typingsSlinky.reachAlertDialog.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.reachAlertDialog.mod.AlertDialogProps
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AlertDialogOverlay {
  @JSImport("@reach/alert-dialog", "AlertDialogOverlay")
  @js.native
  object component extends js.Object
  
  def withProps(p: AlertDialogProps): SharedBuilder_AlertDialogProps_1358710108[LegacyRef[js.Any] with js.Object] = new SharedBuilder_AlertDialogProps_1358710108[LegacyRef[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(leastDestructiveRef: ReactRef[HTMLElement]): SharedBuilder_AlertDialogProps_1358710108[LegacyRef[js.Any] with js.Object] = {
    val __props = js.Dynamic.literal(leastDestructiveRef = leastDestructiveRef.asInstanceOf[js.Any])
    new SharedBuilder_AlertDialogProps_1358710108[LegacyRef[js.Any] with js.Object](js.Array(this.component, __props.asInstanceOf[AlertDialogProps]))
  }
}

