package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.p5.mod.THRESHOLD
  - typingsSlinky.p5.mod.GRAY
  - typingsSlinky.p5.mod.OPAQUE
  - typingsSlinky.p5.mod.INVERT
  - typingsSlinky.p5.mod.POSTERIZE
  - typingsSlinky.p5.mod.BLUR
  - typingsSlinky.p5.mod.ERODE
  - typingsSlinky.p5.mod.DILATE
*/
trait FILTER_TYPE extends js.Object

object FILTER_TYPE {
  @scala.inline
  implicit def apply(value: BLUR): FILTER_TYPE = value.asInstanceOf[FILTER_TYPE]
  @scala.inline
  implicit def apply(value: DILATE): FILTER_TYPE = value.asInstanceOf[FILTER_TYPE]
  @scala.inline
  implicit def apply(value: ERODE): FILTER_TYPE = value.asInstanceOf[FILTER_TYPE]
  @scala.inline
  implicit def apply(value: GRAY): FILTER_TYPE = value.asInstanceOf[FILTER_TYPE]
  @scala.inline
  implicit def apply(value: INVERT): FILTER_TYPE = value.asInstanceOf[FILTER_TYPE]
  @scala.inline
  implicit def apply(value: OPAQUE): FILTER_TYPE = value.asInstanceOf[FILTER_TYPE]
  @scala.inline
  implicit def apply(value: POSTERIZE): FILTER_TYPE = value.asInstanceOf[FILTER_TYPE]
  @scala.inline
  implicit def apply(value: THRESHOLD): FILTER_TYPE = value.asInstanceOf[FILTER_TYPE]
}

