package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.arangodbStrings.HEAD
  - typingsSlinky.arangodb.arangodbStrings.GET
  - typingsSlinky.arangodb.arangodbStrings.POST
  - typingsSlinky.arangodb.arangodbStrings.PUT
  - typingsSlinky.arangodb.arangodbStrings.PATCH
  - typingsSlinky.arangodb.arangodbStrings.DELETE
  - typingsSlinky.arangodb.arangodbStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsSlinky.arangodb.arangodbStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.arangodb.arangodbStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsSlinky.arangodb.arangodbStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsSlinky.arangodb.arangodbStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsSlinky.arangodb.arangodbStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.arangodb.arangodbStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.arangodb.arangodbStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

