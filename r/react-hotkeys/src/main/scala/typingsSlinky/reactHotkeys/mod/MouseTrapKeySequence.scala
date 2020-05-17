package typingsSlinky.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait MouseTrapKeySequence extends KeySequence

object MouseTrapKeySequence {
  @scala.inline
  implicit def apply(value: js.Array[String]): MouseTrapKeySequence = value.asInstanceOf[MouseTrapKeySequence]
  @scala.inline
  implicit def apply(value: String): MouseTrapKeySequence = value.asInstanceOf[MouseTrapKeySequence]
}

