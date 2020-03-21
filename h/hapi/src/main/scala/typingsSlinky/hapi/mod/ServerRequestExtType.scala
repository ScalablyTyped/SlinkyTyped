package typingsSlinky.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapi.hapiStrings.onRequest
  - typingsSlinky.hapi.hapiStrings.onPreAuth
  - typingsSlinky.hapi.hapiStrings.onCredentials
  - typingsSlinky.hapi.hapiStrings.onPostAuth
  - typingsSlinky.hapi.hapiStrings.onPreHandler
  - typingsSlinky.hapi.hapiStrings.onPostHandler
  - typingsSlinky.hapi.hapiStrings.onPreResponse
*/
trait ServerRequestExtType extends js.Object

object ServerRequestExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onCredentials: typingsSlinky.hapi.hapiStrings.onCredentials = this.cast("onCredentials")
  @scala.inline
  def onPostAuth: typingsSlinky.hapi.hapiStrings.onPostAuth = this.cast("onPostAuth")
  @scala.inline
  def onPostHandler: typingsSlinky.hapi.hapiStrings.onPostHandler = this.cast("onPostHandler")
  @scala.inline
  def onPreAuth: typingsSlinky.hapi.hapiStrings.onPreAuth = this.cast("onPreAuth")
  @scala.inline
  def onPreHandler: typingsSlinky.hapi.hapiStrings.onPreHandler = this.cast("onPreHandler")
  @scala.inline
  def onPreResponse: typingsSlinky.hapi.hapiStrings.onPreResponse = this.cast("onPreResponse")
  @scala.inline
  def onRequest: typingsSlinky.hapi.hapiStrings.onRequest = this.cast("onRequest")
}

