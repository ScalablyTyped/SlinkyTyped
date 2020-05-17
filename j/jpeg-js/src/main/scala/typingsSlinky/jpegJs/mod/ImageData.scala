package typingsSlinky.jpegJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jpegJs.mod.BufferRet
  - typingsSlinky.jpegJs.mod.UintArrRet
*/
trait ImageData extends js.Object

object ImageData {
  @scala.inline
  implicit def apply(value: BufferRet | UintArrRet): ImageData = value.asInstanceOf[ImageData]
}

