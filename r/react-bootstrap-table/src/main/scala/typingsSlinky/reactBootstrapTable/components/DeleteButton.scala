package typingsSlinky.reactBootstrapTable.components

import typingsSlinky.reactBootstrapTable.mod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeleteButton {
  
  @JSImport("react-bootstrap-table", "DeleteButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonProps): SharedBuilder_ButtonProps_792854078[typingsSlinky.reactBootstrapTable.mod.DeleteButton] = new SharedBuilder_ButtonProps_792854078[typingsSlinky.reactBootstrapTable.mod.DeleteButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DeleteButton.type): SharedBuilder_ButtonProps_792854078[typingsSlinky.reactBootstrapTable.mod.DeleteButton] = new SharedBuilder_ButtonProps_792854078[typingsSlinky.reactBootstrapTable.mod.DeleteButton](js.Array(this.component, js.Dictionary.empty))()
}
