package typingsSlinky.inputmask.mod

import typingsSlinky.inputmask.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inputmask.anon.End
  - js.Tuple2[java.lang.String, java.lang.String]
*/
trait Range extends js.Object

object Range {
  @scala.inline
  implicit def apply(value: End): Range = value.asInstanceOf[Range]
  @scala.inline
  implicit def apply(value: js.Tuple2[String, String]): Range = value.asInstanceOf[Range]
}

