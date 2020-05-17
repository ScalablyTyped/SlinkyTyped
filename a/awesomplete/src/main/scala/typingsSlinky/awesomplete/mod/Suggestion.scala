package typingsSlinky.awesomplete.mod

import typingsSlinky.awesomplete.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.awesomplete.anon.Label
  - js.Tuple2[java.lang.String, java.lang.String]
*/
trait Suggestion extends js.Object

object Suggestion {
  @scala.inline
  implicit def apply(value: Label): Suggestion = value.asInstanceOf[Suggestion]
  @scala.inline
  implicit def apply(value: String): Suggestion = value.asInstanceOf[Suggestion]
  @scala.inline
  implicit def apply(value: js.Tuple2[String, String]): Suggestion = value.asInstanceOf[Suggestion]
}

