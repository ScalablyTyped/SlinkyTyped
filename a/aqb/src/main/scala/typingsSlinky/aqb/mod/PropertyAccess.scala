package typingsSlinky.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyAccess
  extends Expression
     with Instantiable2[/* obj */ js.Any, /* keys */ js.Array[js.Any], Expression] {
  
  var _keys: js.Array[Expression] = js.native
  
  var _obj: Expression = js.native
  
  def toAQL(): String = js.native
}
