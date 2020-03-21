package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aliOss.aliOssStrings.GET
  - typingsSlinky.aliOss.aliOssStrings.POST
  - typingsSlinky.aliOss.aliOssStrings.DELETE
  - typingsSlinky.aliOss.aliOssStrings.PUT
*/
trait HTTPMethods extends js.Object

object HTTPMethods {
  @scala.inline
  def DELETE: typingsSlinky.aliOss.aliOssStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.aliOss.aliOssStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsSlinky.aliOss.aliOssStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.aliOss.aliOssStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

