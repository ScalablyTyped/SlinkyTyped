package typingsSlinky.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.doubleclickGpt.googletag.SingleSizeArray
  - typingsSlinky.doubleclickGpt.googletag.NamedSize
*/
trait SingleSize extends GeneralSize

object SingleSize {
  @scala.inline
  implicit def apply(value: NamedSize): SingleSize = value.asInstanceOf[SingleSize]
  @scala.inline
  implicit def apply(value: SingleSizeArray): SingleSize = value.asInstanceOf[SingleSize]
}

