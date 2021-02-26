package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationChart extends ChartBaseClearable {
  
  def draw(data: DataTable, options: AnnotationChartOptions): Unit = js.native
  def draw(data: DataTable, options: AnnotationChartOptions, state: js.Any): Unit = js.native
  def draw(data: DataView, options: AnnotationChartOptions): Unit = js.native
  def draw(data: DataView, options: AnnotationChartOptions, state: js.Any): Unit = js.native
  
  def getVisibleChartRange(): End = js.native
  
  def hideDataColumns(columnIndexes: js.Array[Double]): Unit = js.native
  def hideDataColumns(columnIndexes: Double): Unit = js.native
  
  def setVisibleChartRange(start: js.Date, end: js.Date): Unit = js.native
  
  def showDataColumns(columnIndexes: js.Array[Double]): Unit = js.native
  def showDataColumns(columnIndexes: Double): Unit = js.native
}
