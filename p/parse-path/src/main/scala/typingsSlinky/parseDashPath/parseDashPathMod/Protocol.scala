package typingsSlinky.parseDashPath.parseDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parseDashPath.parseDashPathStrings.http
  - typings.parseDashPath.parseDashPathStrings.https
  - typings.parseDashPath.parseDashPathStrings.ssh
  - typings.parseDashPath.parseDashPathStrings.file
  - typings.parseDashPath.parseDashPathStrings.git
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typingsSlinky.parseDashPath.parseDashPathStrings.file = this.cast("file")
  @scala.inline
  def git: typingsSlinky.parseDashPath.parseDashPathStrings.git = this.cast("git")
  @scala.inline
  def http: typingsSlinky.parseDashPath.parseDashPathStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.parseDashPath.parseDashPathStrings.https = this.cast("https")
  @scala.inline
  def ssh: typingsSlinky.parseDashPath.parseDashPathStrings.ssh = this.cast("ssh")
}

