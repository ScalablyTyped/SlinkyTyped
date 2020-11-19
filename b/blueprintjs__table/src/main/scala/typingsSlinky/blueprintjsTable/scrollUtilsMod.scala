package typingsSlinky.blueprintjsTable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsTable.anon.ScrollLeft
import typingsSlinky.blueprintjsTable.blueprintjsTableStrings.horizontal
import typingsSlinky.blueprintjsTable.blueprintjsTableStrings.vertical
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", JSImport.Namespace)
@js.native
object scrollUtilsMod extends js.Object {
  
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double]
  ): ScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: js.UndefOr[scala.Nothing],
    numFrozenColumns: Double
  ): ScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double
  ): ScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double,
    numFrozenColumns: Double
  ): ScrollLeft = js.native
  
  @JSName("measureScrollBarThickness")
  def measureScrollBarThickness_horizontal(element: HTMLElement, direction: horizontal): Double = js.native
  @JSName("measureScrollBarThickness")
  def measureScrollBarThickness_vertical(element: HTMLElement, direction: vertical): Double = js.native
}
