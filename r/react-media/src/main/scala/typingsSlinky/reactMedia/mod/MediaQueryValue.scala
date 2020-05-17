package typingsSlinky.reactMedia.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All allowed forms of media query inputs
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.reactMedia.mod.MediaQueryObject
  - js.Array[typingsSlinky.reactMedia.mod.MediaQueryObject]
*/
trait MediaQueryValue extends js.Object

object MediaQueryValue {
  @scala.inline
  implicit def apply(value: js.Array[MediaQueryObject]): MediaQueryValue = value.asInstanceOf[MediaQueryValue]
  @scala.inline
  implicit def apply(value: MediaQueryObject): MediaQueryValue = value.asInstanceOf[MediaQueryValue]
  @scala.inline
  implicit def apply(value: String): MediaQueryValue = value.asInstanceOf[MediaQueryValue]
}

