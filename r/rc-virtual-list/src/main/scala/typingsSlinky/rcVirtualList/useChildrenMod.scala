package typingsSlinky.rcVirtualList

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcVirtualList.interfaceMod.RenderFunc
import typingsSlinky.rcVirtualList.interfaceMod.SharedConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useChildrenMod {
  
  @JSImport("rc-virtual-list/es/hooks/useChildren", JSImport.Default)
  @js.native
  def default[T](
    list: js.Array[T],
    startIndex: Double,
    endIndex: Double,
    setNodeRef: js.Function2[/* item */ T, /* element */ HTMLElement, Unit],
    renderFunc: RenderFunc[T],
    hasGetKey: SharedConfig[T]
  ): js.Array[ReactElement] = js.native
}
