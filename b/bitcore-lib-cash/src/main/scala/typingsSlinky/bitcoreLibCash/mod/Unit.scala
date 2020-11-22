package typingsSlinky.bitcoreLibCash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "Unit")
@js.native
class Unit protected () extends js.Object {
  def this(amount: Double, unitPreference: String) = this()
  
  def toBTC(): Double = js.native
  
  def toBits(): Double = js.native
  
  def toMilis(): Double = js.native
  
  def toSatoshis(): Double = js.native
}
/* static members */
@JSImport("bitcore-lib-cash", "Unit")
@js.native
object Unit extends js.Object {
  
  def fromBTC(amount: Double): Unit = js.native
  
  def fromBits(amount: Double): Unit = js.native
  
  def fromMilis(amount: Double): Unit = js.native
  
  def fromSatoshis(amount: Double): Unit = js.native
}
