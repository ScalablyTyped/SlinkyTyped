package typingsSlinky.requiresDashPort.requiresDashPortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.requiresDashPort.requiresDashPortStrings.http
  - typings.requiresDashPort.requiresDashPortStrings.https
  - typings.requiresDashPort.requiresDashPortStrings.ws
  - typings.requiresDashPort.requiresDashPortStrings.wss
  - typings.requiresDashPort.requiresDashPortStrings.ftp
  - typings.requiresDashPort.requiresDashPortStrings.gopher
  - typings.requiresDashPort.requiresDashPortStrings.file
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typingsSlinky.requiresDashPort.requiresDashPortStrings.file = this.cast("file")
  @scala.inline
  def ftp: typingsSlinky.requiresDashPort.requiresDashPortStrings.ftp = this.cast("ftp")
  @scala.inline
  def gopher: typingsSlinky.requiresDashPort.requiresDashPortStrings.gopher = this.cast("gopher")
  @scala.inline
  def http: typingsSlinky.requiresDashPort.requiresDashPortStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.requiresDashPort.requiresDashPortStrings.https = this.cast("https")
  @scala.inline
  def ws: typingsSlinky.requiresDashPort.requiresDashPortStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typingsSlinky.requiresDashPort.requiresDashPortStrings.wss = this.cast("wss")
}

