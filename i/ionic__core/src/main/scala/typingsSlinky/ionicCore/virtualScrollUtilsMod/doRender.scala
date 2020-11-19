package typingsSlinky.ionicCore.virtualScrollUtilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.Cell
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.VirtualNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
