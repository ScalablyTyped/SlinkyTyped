package typingsSlinky.reachAlertDialog.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.reachAlertDialog.mod.AlertDialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AlertDialog {
  
  @JSImport("@reach/alert-dialog", "AlertDialog")
  @js.native
  object component extends js.Object
  
  def withProps(p: AlertDialogProps): SharedBuilder_AlertDialogProps_1358710108[HTMLDivElement] = new SharedBuilder_AlertDialogProps_1358710108[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(leastDestructiveRef: ReactRef[HTMLElement]): SharedBuilder_AlertDialogProps_1358710108[HTMLDivElement] = {
    val __props = js.Dynamic.literal(leastDestructiveRef = leastDestructiveRef.asInstanceOf[js.Any])
    new SharedBuilder_AlertDialogProps_1358710108[HTMLDivElement](js.Array(this.component, __props.asInstanceOf[AlertDialogProps]))
  }
}
