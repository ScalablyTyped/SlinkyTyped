package typingsSlinky.datatablesNetScroller.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollerMethods extends Api {
  
  /*
    * Calculate the row number that will be found at the given pixel position
    * (y-scroll).
    */
  def pixelsToRow(pixels: Double): Double = js.native
  def pixelsToRow(pixels: Double, intParse: js.UndefOr[scala.Nothing], virtual: Boolean): Double = js.native
  def pixelsToRow(pixels: Double, intParse: Boolean): Double = js.native
  def pixelsToRow(pixels: Double, intParse: Boolean, virtual: Boolean): Double = js.native
  
  /*
    * Calculate the pixel position from the top of the scrolling container for
    * a given row
    */
  def rowToPixels(rowIdx: Double): Double = js.native
  def rowToPixels(rowIdx: Double, intParse: js.UndefOr[scala.Nothing], virtual: Boolean): Double = js.native
  def rowToPixels(rowIdx: Double, intParse: Boolean): Double = js.native
  def rowToPixels(rowIdx: Double, intParse: Boolean, virtual: Boolean): Double = js.native
  
  def scrollToRow(rowIdx: Double): Api = js.native
  def scrollToRow(rowIdx: Double, animate: Boolean): Api = js.native
}
