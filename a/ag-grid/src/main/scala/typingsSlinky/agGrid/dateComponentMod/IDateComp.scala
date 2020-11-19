package typingsSlinky.agGrid.dateComponentMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateComp
  extends IComponent[IDateParams]
     with IDate
object IDateComp {
  
  @scala.inline
  def apply(getDate: () => js.Date, getGui: () => HTMLElement, setDate: js.Date => Unit): IDateComp = {
    val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), getGui = js.Any.fromFunction0(getGui), setDate = js.Any.fromFunction1(setDate))
    __obj.asInstanceOf[IDateComp]
  }
}
