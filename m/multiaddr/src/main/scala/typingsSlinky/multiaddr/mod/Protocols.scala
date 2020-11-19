package typingsSlinky.multiaddr.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protocols extends js.Object {
  
  def apply(proto: String): Protocol = js.native
  def apply(proto: Double): Protocol = js.native
  
  val V: Double = js.native
  
  val codes: NumberDictionary[Protocol] = js.native
  
  val lengthPrefixedVarSize: Double = js.native
  
  val names: StringDictionary[Protocol] = js.native
  
  def `object`(code: Code, size: Size, name: String, resolvable: Boolean): Protocol = js.native
  
  val table: js.Array[js.Tuple3[Double, Double, String]] = js.native
}
