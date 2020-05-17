package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - M with Extension
  - M
*/
trait Meta[D /* <: js.Object */, Extension, M] extends js.Object

object Meta {
  @scala.inline
  implicit def apply[D, Extension, M](value: (M with Extension) | M): Meta[D, Extension, M] = value.asInstanceOf[Meta[D, Extension, M]]
}

