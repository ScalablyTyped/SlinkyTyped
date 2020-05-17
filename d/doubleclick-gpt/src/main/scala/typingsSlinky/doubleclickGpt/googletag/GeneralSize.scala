package typingsSlinky.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.doubleclickGpt.googletag.SingleSize
  - typingsSlinky.doubleclickGpt.googletag.MultiSize
*/
trait GeneralSize extends js.Object

object GeneralSize {
  @scala.inline
  implicit def apply(value: MultiSize): GeneralSize = value.asInstanceOf[GeneralSize]
  @scala.inline
  implicit def apply(value: SingleSize): GeneralSize = value.asInstanceOf[GeneralSize]
}

