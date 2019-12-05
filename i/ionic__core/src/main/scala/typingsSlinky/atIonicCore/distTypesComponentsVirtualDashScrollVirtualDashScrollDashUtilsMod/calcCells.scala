package typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashUtilsMod

import typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.Cell
import typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.FooterHeightFn
import typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.HeaderFn
import typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.HeaderHeightFn
import typingsSlinky.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.ItemHeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll-utils", "calcCells")
@js.native
object calcCells extends js.Object {
  def apply(
    items: js.Array[_],
    itemHeight: js.UndefOr[ItemHeightFn],
    headerHeight: js.UndefOr[HeaderHeightFn],
    footerHeight: js.UndefOr[FooterHeightFn],
    headerFn: js.UndefOr[HeaderFn],
    footerFn: js.UndefOr[HeaderFn],
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = js.native
}

