package typingsSlinky.rotJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js", "Util")
@js.native
object Util extends js.Object {
  
  def capitalize(string: String): String = js.native
  
  def clamp(`val`: Double): Double = js.native
  def clamp(`val`: Double, min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def clamp(`val`: Double, min: Double): Double = js.native
  def clamp(`val`: Double, min: Double, max: Double): Double = js.native
  
  def format(template: String, args: js.Any*): String = js.native
  
  def mod(x: Double, n: Double): Double = js.native
}
