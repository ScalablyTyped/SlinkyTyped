package typingsSlinky.arrify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("arrify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[ValueType](value: ValueType): (js.Array[_ | js.Any | String | ValueType]) | ValueType = js.native
}
