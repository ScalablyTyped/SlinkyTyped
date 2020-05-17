package typingsSlinky.rcTable.fixUtilMod

import typingsSlinky.rcTable.anon.Fixed
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.rcTable.rcTableStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/utils/fixUtil", "getCellFixedInfo")
@js.native
object getCellFixedInfo_rtl extends js.Object {
  def apply(
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: rtl
  ): FixedInfo = js.native
}

