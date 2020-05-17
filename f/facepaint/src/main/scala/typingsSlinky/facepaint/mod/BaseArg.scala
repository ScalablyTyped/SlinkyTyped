package typingsSlinky.facepaint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - js.Array[js.Object]
*/
trait BaseArg extends Arg

object BaseArg {
  @scala.inline
  implicit def apply(value: js.Array[js.Object]): BaseArg = value.asInstanceOf[BaseArg]
  @scala.inline
  implicit def apply(value: js.Object): BaseArg = value.asInstanceOf[BaseArg]
}

