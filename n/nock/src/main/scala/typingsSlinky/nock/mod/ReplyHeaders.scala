package typingsSlinky.nock.mod

import typingsSlinky.std.Map
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[java.lang.String, typingsSlinky.nock.mod.ReplyHeaderValue]
  - typingsSlinky.std.Map[java.lang.String, typingsSlinky.nock.mod.ReplyHeaderValue]
  - js.Array[typingsSlinky.nock.mod.ReplyHeaderValue]
*/
trait ReplyHeaders extends js.Object

object ReplyHeaders {
  @scala.inline
  implicit def apply(value: js.Array[ReplyHeaderValue]): ReplyHeaders = value.asInstanceOf[ReplyHeaders]
  @scala.inline
  implicit def apply(value: Map[String, ReplyHeaderValue]): ReplyHeaders = value.asInstanceOf[ReplyHeaders]
  @scala.inline
  implicit def apply(value: Record[String, ReplyHeaderValue]): ReplyHeaders = value.asInstanceOf[ReplyHeaders]
}

