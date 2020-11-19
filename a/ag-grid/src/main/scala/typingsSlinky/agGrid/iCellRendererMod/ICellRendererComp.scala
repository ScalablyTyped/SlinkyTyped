package typingsSlinky.agGrid.iCellRendererMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellRendererComp
  extends ICellRenderer
     with IComponent[ICellRendererParams]
object ICellRendererComp {
  
  @scala.inline
  def apply(getGui: () => HTMLElement, refresh: js.Any => Boolean): ICellRendererComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[ICellRendererComp]
  }
}
