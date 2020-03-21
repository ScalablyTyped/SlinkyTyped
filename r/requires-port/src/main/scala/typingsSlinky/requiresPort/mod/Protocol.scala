package typingsSlinky.requiresPort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.requiresPort.requiresPortStrings.http
  - typingsSlinky.requiresPort.requiresPortStrings.https
  - typingsSlinky.requiresPort.requiresPortStrings.ws
  - typingsSlinky.requiresPort.requiresPortStrings.wss
  - typingsSlinky.requiresPort.requiresPortStrings.ftp
  - typingsSlinky.requiresPort.requiresPortStrings.gopher
  - typingsSlinky.requiresPort.requiresPortStrings.file
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typingsSlinky.requiresPort.requiresPortStrings.file = this.cast("file")
  @scala.inline
  def ftp: typingsSlinky.requiresPort.requiresPortStrings.ftp = this.cast("ftp")
  @scala.inline
  def gopher: typingsSlinky.requiresPort.requiresPortStrings.gopher = this.cast("gopher")
  @scala.inline
  def http: typingsSlinky.requiresPort.requiresPortStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.requiresPort.requiresPortStrings.https = this.cast("https")
  @scala.inline
  def ws: typingsSlinky.requiresPort.requiresPortStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typingsSlinky.requiresPort.requiresPortStrings.wss = this.cast("wss")
}

