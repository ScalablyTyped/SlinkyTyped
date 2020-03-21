package typingsSlinky.fxn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fxn.fxnStrings.GET
  - typingsSlinky.fxn.fxnStrings.POST
  - typingsSlinky.fxn.fxnStrings.PUT
  - typingsSlinky.fxn.fxnStrings.DELETE
  - typingsSlinky.fxn.fxnStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsSlinky.fxn.fxnStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.fxn.fxnStrings.GET = this.cast("GET")
  @scala.inline
  def OPTIONS: typingsSlinky.fxn.fxnStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def POST: typingsSlinky.fxn.fxnStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.fxn.fxnStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

