package typingsSlinky.fsPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fsPromise.mod.JsonReplacerArray
  - typingsSlinky.fsPromise.mod.JsonReplacerFunction
*/
trait JsonReplacer extends js.Object

object JsonReplacer {
  @scala.inline
  implicit def apply(value: JsonReplacerArray): JsonReplacer = value.asInstanceOf[JsonReplacer]
  @scala.inline
  implicit def apply(value: JsonReplacerFunction): JsonReplacer = value.asInstanceOf[JsonReplacer]
}

