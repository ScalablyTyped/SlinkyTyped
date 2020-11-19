package typingsSlinky.agGrid.iCellEditorMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellEditorComp
  extends ICellEditor
     with IComponent[ICellEditorParams]
object ICellEditorComp {
  
  @scala.inline
  def apply(getGui: () => HTMLElement, getValue: () => js.Any): ICellEditorComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[ICellEditorComp]
  }
}
