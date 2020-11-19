package typingsSlinky.d20

import typingsSlinky.d20.d20Booleans.`false`
import typingsSlinky.d20.d20Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d20", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def roll(dice: String): Double = js.native
  def roll(dice: String, verbose: Boolean): Double = js.native
  def roll(dice: Double): Double = js.native
  def roll(dice: Double, verbose: Boolean): Double = js.native
  @JSName("roll")
  def roll_false(dice: String, verbose: `false`): Double = js.native
  @JSName("roll")
  def roll_false(dice: Double, verbose: `false`): Double = js.native
  @JSName("roll")
  def roll_true(dice: String, verbose: `true`): js.Array[Double] = js.native
  @JSName("roll")
  def roll_true(dice: Double, verbose: `true`): js.Array[Double] = js.native
  
  def verboseRoll(dice: String): js.Array[Double] = js.native
  def verboseRoll(dice: Double): js.Array[Double] = js.native
}
