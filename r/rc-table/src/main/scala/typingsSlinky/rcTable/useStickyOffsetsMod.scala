package typingsSlinky.rcTable

import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/hooks/useStickyOffsets", JSImport.Namespace)
@js.native
object useStickyOffsetsMod extends js.Object {
  /**
    * Get sticky column offset width
    */
  @JSName("default")
  def default_ltr(colWidths: js.Array[Double], columCount: Double, direction: ltr): StickyOffsets = js.native
  @JSName("default")
  def default_rtl(colWidths: js.Array[Double], columCount: Double, direction: rtl): StickyOffsets = js.native
}

