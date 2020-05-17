package typingsSlinky.reachAlertDialog.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AlertDialogLabel {
  @JSImport("@reach/alert-dialog", "AlertDialogLabel")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLDivElement]): SharedBuilder_HTMLProps74936298[LegacyRef[js.Any]] = new SharedBuilder_HTMLProps74936298[LegacyRef[js.Any]](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AlertDialogLabel.type): SharedBuilder_HTMLProps74936298[LegacyRef[js.Any]] = new SharedBuilder_HTMLProps74936298[LegacyRef[js.Any]](js.Array(this.component, js.Dictionary.empty))()
}

