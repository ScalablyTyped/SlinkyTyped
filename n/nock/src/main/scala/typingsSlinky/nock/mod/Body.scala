package typingsSlinky.nock.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Record[java.lang.String, js.Any]
*/
trait Body extends ReplyBody

object Body {
  @scala.inline
  implicit def apply(value: Record[String, js.Any]): Body = value.asInstanceOf[Body]
  @scala.inline
  implicit def apply(value: String): Body = value.asInstanceOf[Body]
}

