package typingsSlinky.rcVirtualList

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcVirtualList.interfaceMod.RenderFunc
import typingsSlinky.rcVirtualList.interfaceMod.SharedConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-virtual-list/es/hooks/useChildren", JSImport.Namespace)
@js.native
object useChildrenMod extends js.Object {
  
  def default[T](
    list: js.Array[T],
    startIndex: Double,
    endIndex: Double,
    setNodeRef: js.Function2[/* item */ T, /* element */ HTMLElement, Unit],
    renderFunc: RenderFunc[T],
    hasGetKey: SharedConfig[T]
  ): js.Array[ReactElement] = js.native
}
