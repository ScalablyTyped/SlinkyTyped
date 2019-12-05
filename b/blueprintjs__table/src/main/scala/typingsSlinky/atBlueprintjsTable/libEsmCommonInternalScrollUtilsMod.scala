package typingsSlinky.atBlueprintjsTable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atBlueprintjsTable.atBlueprintjsTableStrings.horizontal
import typingsSlinky.atBlueprintjsTable.atBlueprintjsTableStrings.vertical
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", JSImport.Namespace)
@js.native
object libEsmCommonInternalScrollUtilsMod extends js.Object {
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double]
  ): Anon_ScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double
  ): Anon_ScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double,
    numFrozenColumns: Double
  ): Anon_ScrollLeft = js.native
  @JSName("measureScrollBarThickness")
  def measureScrollBarThickness_horizontal(element: HTMLElement, direction: horizontal): Double = js.native
  @JSName("measureScrollBarThickness")
  def measureScrollBarThickness_vertical(element: HTMLElement, direction: vertical): Double = js.native
}

