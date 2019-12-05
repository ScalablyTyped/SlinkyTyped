package typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashUtilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.Cell
import typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.ItemRenderFn
import typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.VirtualNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll-utils", "doRender")
@js.native
object doRender extends js.Object {
  def apply(
    el: HTMLElement,
    nodeRender: ItemRenderFn,
    dom: js.Array[VirtualNode],
    updateCellHeight: js.Function2[/* cell */ Cell, /* node */ HTMLElement, Unit]
  ): Unit = js.native
}

