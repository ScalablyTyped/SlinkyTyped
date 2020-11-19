package typingsSlinky.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("famous/physics", "Drag")
@js.native
class Drag () extends Force {
  def this(targets: js.Any) = this()
  def this(targets: js.Array[_]) = this()
  def this(targets: js.UndefOr[scala.Nothing], options: IDragOptions) = this()
  def this(targets: js.Any, options: IDragOptions) = this()
  def this(targets: js.Array[_], options: IDragOptions) = this()
  
  def init(): Unit = js.native
  
  var max: Double = js.native
  
  var strength: Double = js.native
  
  def `type`(v: Double): Double = js.native
}
/* static members */
@JSImport("famous/physics", "Drag")
@js.native
object Drag extends js.Object {
  
  def LINEAR(v: Double): Double = js.native
  
  def QUADRATIC(v: Double): Double = js.native
}
