package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.nock.mod.ReplyHeaderFunction
*/
trait ReplyHeaderValue extends js.Object

object ReplyHeaderValue {
  @scala.inline
  implicit def apply(value: js.Array[String]): ReplyHeaderValue = value.asInstanceOf[ReplyHeaderValue]
  @scala.inline
  implicit def apply(value: ReplyHeaderFunction): ReplyHeaderValue = value.asInstanceOf[ReplyHeaderValue]
  @scala.inline
  implicit def apply(value: String): ReplyHeaderValue = value.asInstanceOf[ReplyHeaderValue]
}

