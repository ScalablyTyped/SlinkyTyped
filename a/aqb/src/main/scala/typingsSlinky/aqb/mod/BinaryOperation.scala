package typingsSlinky.aqb.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryOperation
  extends Operation
     with Instantiable3[/* operator */ String, /* value1 */ js.Any, /* value2 */ js.Any, Operation] {
  
  var _operator: String = js.native
  
  def toAQL(): String = js.native
}
