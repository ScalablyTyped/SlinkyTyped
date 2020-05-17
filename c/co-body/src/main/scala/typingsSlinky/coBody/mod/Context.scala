package typingsSlinky.coBody.mod

import typingsSlinky.coBody.anon.Req
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.httpMod.IncomingMessage
  - typingsSlinky.coBody.anon.Req
*/
trait Context extends js.Object

object Context {
  @scala.inline
  implicit def apply(value: IncomingMessage): Context = value.asInstanceOf[Context]
  @scala.inline
  implicit def apply(value: Req): Context = value.asInstanceOf[Context]
}

