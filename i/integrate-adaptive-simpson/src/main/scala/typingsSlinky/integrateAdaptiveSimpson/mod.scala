package typingsSlinky.integrateAdaptiveSimpson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("integrate-adaptive-simpson", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(f: Func, a: Double, b: Double): Double = js.native
  def apply(f: Func, a: Double, b: Double, tol: js.UndefOr[scala.Nothing], maxdepth: Double): Double = js.native
  def apply(f: Func, a: Double, b: Double, tol: Double): Double = js.native
  def apply(f: Func, a: Double, b: Double, tol: Double, maxdepth: Double): Double = js.native
  
  type Func = js.Function1[/* val */ Double, Double]
}
