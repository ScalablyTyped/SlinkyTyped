package typingsSlinky.distributionsPoissonQuantile.mod

import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypefloat32
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypefloat64undefi
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeint16
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeint32
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeint8
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeuint16
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeuint32
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeuint8
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeuint8clamped
import typingsSlinky.distributionsPoissonQuantile.anon.Optionsdtypeundefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("distributions-poisson-quantile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(p: js.Array[Double]): js.Array[Double] = js.native
  def apply(p: js.Array[Double], options: Optionsdtypeundefined): js.Array[Double] = js.native
  /**
    * Evaluates the quantile function for a Poisson distribution.
    * @param p input value
    * @param options function options
    * @returns quantile function value(s)
    */
  def apply(p: Double): Double | Data | Matrix = js.native
  def apply(p: Double, options: Options): Double | Data | Matrix = js.native
  def apply(p: Data): Double | Data | Matrix = js.native
  def apply(p: Data, options: Optionsdtypefloat32): js.typedarray.Float32Array = js.native
  def apply(p: Data, options: Optionsdtypefloat64undefi): js.typedarray.Float64Array = js.native
  def apply(p: Data, options: Optionsdtypeint16): js.typedarray.Int16Array = js.native
  def apply(p: Data, options: Optionsdtypeint32): js.typedarray.Int32Array = js.native
  def apply(p: Data, options: Optionsdtypeint8): js.typedarray.Int8Array = js.native
  def apply(p: Data, options: Optionsdtypeuint16): js.typedarray.Uint16Array = js.native
  def apply(p: Data, options: Optionsdtypeuint32): js.typedarray.Uint32Array = js.native
  def apply(p: Data, options: Optionsdtypeuint8): js.typedarray.Uint8Array = js.native
  def apply(p: Data, options: Optionsdtypeuint8clamped): js.typedarray.Uint8ClampedArray = js.native
  def apply(p: Data, options: Options): Double | Data | Matrix = js.native
  def apply(p: MatrixLike): Double | Data | Matrix = js.native
  def apply(p: MatrixLike, options: Options): Double | Data | Matrix = js.native
}
