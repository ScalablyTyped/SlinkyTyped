package typingsSlinky.jsen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsenUnique extends js.Object {
  
  def apply(array: js.Array[_]): Boolean = js.native
  
  def findIndex(
    array: js.Array[_],
    value: js.Any,
    comparator: js.Function2[/* obj1 */ js.Any, /* obj2 */ js.Any, Boolean]
  ): Double = js.native
}
