package typingsSlinky.agGrid.headerGroupCompMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHeaderGroupComp
  extends IHeaderGroup
     with IComponent[IHeaderGroupParams]
object IHeaderGroupComp {
  
  @scala.inline
  def apply(getGui: () => HTMLElement): IHeaderGroupComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
    __obj.asInstanceOf[IHeaderGroupComp]
  }
}
