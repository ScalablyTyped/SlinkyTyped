package typingsSlinky.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait NamedSize extends SingleSize

object NamedSize {
  @scala.inline
  implicit def apply(value: js.Array[String]): NamedSize = value.asInstanceOf[NamedSize]
  @scala.inline
  implicit def apply(value: String): NamedSize = value.asInstanceOf[NamedSize]
}

