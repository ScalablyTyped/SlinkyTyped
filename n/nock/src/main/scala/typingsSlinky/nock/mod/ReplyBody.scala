package typingsSlinky.nock.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// a string or decoded JSON
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nock.mod.Body
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.fsMod.ReadStream
*/
trait ReplyBody extends js.Object

object ReplyBody {
  @scala.inline
  implicit def apply(value: Body): ReplyBody = value.asInstanceOf[ReplyBody]
  @scala.inline
  implicit def apply(value: Buffer): ReplyBody = value.asInstanceOf[ReplyBody]
  @scala.inline
  implicit def apply(value: ReadStream): ReplyBody = value.asInstanceOf[ReplyBody]
}

