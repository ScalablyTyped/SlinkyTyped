package typingsSlinky.blockingProxy.webdriverCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.blockingProxy.blockingProxyStrings.GET
  - typingsSlinky.blockingProxy.blockingProxyStrings.POST
  - typingsSlinky.blockingProxy.blockingProxyStrings.DELETE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsSlinky.blockingProxy.blockingProxyStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.blockingProxy.blockingProxyStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsSlinky.blockingProxy.blockingProxyStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

