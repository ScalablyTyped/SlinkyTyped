package typingsSlinky.agGrid.headerCompMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHeaderComp
  extends IHeader
     with IComponent[IHeaderParams]
object IHeaderComp {
  
  @scala.inline
  def apply(getGui: () => HTMLElement): IHeaderComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
    __obj.asInstanceOf[IHeaderComp]
  }
}
