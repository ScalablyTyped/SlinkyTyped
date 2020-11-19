package typingsSlinky.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilScaleOrdinal
  extends js.Function {
  
  def apply(x: Double): Double = js.native
  
  def domain(values: js.Array[_]): UtilScaleOrdinal = js.native
  
  def invert(x: Double): Double = js.native
  
  def range(values: js.Array[_]): UtilScaleOrdinal = js.native
  
  def rangeBands(interval: Double): js.Function0[Unit] = js.native
  def rangeBands(interval: Double, padding: js.UndefOr[scala.Nothing], outerPadding: Double): js.Function0[Unit] = js.native
  def rangeBands(interval: Double, padding: Double): js.Function0[Unit] = js.native
  def rangeBands(interval: Double, padding: Double, outerPadding: Double): js.Function0[Unit] = js.native
  
  def rangePoints(interval: Double): js.Function0[Unit] = js.native
  def rangePoints(interval: Double, padding: Double): js.Function0[Unit] = js.native
}
