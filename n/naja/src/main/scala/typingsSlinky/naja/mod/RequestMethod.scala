package typingsSlinky.naja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.naja.najaStrings.GET
  - typingsSlinky.naja.najaStrings.POST
  - typingsSlinky.naja.najaStrings.PUT
  - typingsSlinky.naja.najaStrings.PATCH
  - typingsSlinky.naja.najaStrings.DELETE
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  def DELETE: typingsSlinky.naja.najaStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.naja.najaStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typingsSlinky.naja.najaStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.naja.najaStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.naja.najaStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

