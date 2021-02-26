package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RowTogglerButton {
  
  @JSImport("primereact/components/datatable/RowTogglerButton", "RowTogglerButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RowTogglerButton.type): Default[tag.type, typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButton] = new Default[tag.type, typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButton](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RowTogglerButtonProps): Default[tag.type, typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButton] = new Default[tag.type, typingsSlinky.primereact.rowTogglerButtonMod.RowTogglerButton](js.Array(this.component, p.asInstanceOf[js.Any]))
}
