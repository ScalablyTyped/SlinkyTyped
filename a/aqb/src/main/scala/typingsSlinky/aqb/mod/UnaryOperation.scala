package typingsSlinky.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnaryOperation
  extends Expression
     with Instantiable2[/* functionName */ String, /* args (repeated) */ js.Any, Expression] {
  
  var _operator: String = js.native
  
  def toAQL(): String = js.native
}
