package typingsSlinky.rcVirtualList

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.rcVirtualList.interfaceMod.GetKey
import typingsSlinky.rcVirtualList.listMod.ScrollTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-virtual-list/es/hooks/useScrollTo", JSImport.Namespace)
@js.native
object useScrollToMod extends js.Object {
  
  def default[T](
    containerRef: ReactRef[HTMLDivElement],
    data: js.Array[T],
    heights: typingsSlinky.rcVirtualList.cacheMapMod.default,
    itemHeight: Double,
    getKey: GetKey[T],
    collectHeight: js.Function0[Unit],
    syncScrollTop: js.Function1[/* newTop */ Double, Unit],
    triggerFlash: js.Function0[Unit]
  ): ScrollTo = js.native
}
