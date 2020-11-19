package typingsSlinky.cheapRuler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cheap-ruler", JSImport.Default)
@js.native
class default protected () extends CheapRuler {
  def this(lat: Double) = this()
  def this(lat: Double, units: String) = this()
}
/* static members */
@JSImport("cheap-ruler", JSImport.Default)
@js.native
object default extends js.Object {
  
  def fromTile(y: Double, z: Double): CheapRuler = js.native
  def fromTile(y: Double, z: Double, units: String): CheapRuler = js.native
  
  var units: Factors = js.native
}
