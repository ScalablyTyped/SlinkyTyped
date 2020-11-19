package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RowTogglerButton {
  
  @JSImport("primereact/components/datatable/RowTogglerButton", "RowTogglerButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: RowTogglerButtonProps): Default[tag.type, typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButton] = new Default[tag.type, typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RowTogglerButton.type): Default[tag.type, typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButton] = new Default[tag.type, typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButton](js.Array(this.component, js.Dictionary.empty))()
}
