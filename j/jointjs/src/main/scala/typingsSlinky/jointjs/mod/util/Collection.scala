package typingsSlinky.jointjs.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - js.Array[js.Any]
*/
trait Collection extends js.Object

object Collection {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): Collection = value.asInstanceOf[Collection]
  @scala.inline
  implicit def apply(value: js.Object): Collection = value.asInstanceOf[Collection]
}

