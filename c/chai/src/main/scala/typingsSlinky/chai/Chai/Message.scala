package typingsSlinky.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function0[java.lang.String]
*/
trait Message extends js.Object

object Message {
  @scala.inline
  implicit def apply(value: js.Function0[String]): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: String): Message = value.asInstanceOf[Message]
}

