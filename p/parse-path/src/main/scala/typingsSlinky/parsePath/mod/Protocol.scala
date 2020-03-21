package typingsSlinky.parsePath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parsePath.parsePathStrings.http
  - typingsSlinky.parsePath.parsePathStrings.https
  - typingsSlinky.parsePath.parsePathStrings.ssh
  - typingsSlinky.parsePath.parsePathStrings.file
  - typingsSlinky.parsePath.parsePathStrings.git
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typingsSlinky.parsePath.parsePathStrings.file = this.cast("file")
  @scala.inline
  def git: typingsSlinky.parsePath.parsePathStrings.git = this.cast("git")
  @scala.inline
  def http: typingsSlinky.parsePath.parsePathStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.parsePath.parsePathStrings.https = this.cast("https")
  @scala.inline
  def ssh: typingsSlinky.parsePath.parsePathStrings.ssh = this.cast("ssh")
}

