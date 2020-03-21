package typingsSlinky.protractorHttpMock.mod.requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request methods type
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.GET
  - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.POST
  - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.DELETE
  - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PUT
  - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.HEAD
  - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PATCH
  - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.JSONP
*/
trait Method extends js.Object

object Method {
  @scala.inline
  def DELETE: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def JSONP: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.JSONP = this.cast("JSONP")
  @scala.inline
  def PATCH: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

