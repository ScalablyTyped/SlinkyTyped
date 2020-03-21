package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.aix
  - typingsSlinky.node.nodeStrings.android
  - typingsSlinky.node.nodeStrings.darwin
  - typingsSlinky.node.nodeStrings.freebsd
  - typingsSlinky.node.nodeStrings.linux
  - typingsSlinky.node.nodeStrings.openbsd
  - typingsSlinky.node.nodeStrings.sunos
  - typingsSlinky.node.nodeStrings.win32
  - typingsSlinky.node.nodeStrings.cygwin
  - typingsSlinky.node.nodeStrings.netbsd
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def aix: typingsSlinky.node.nodeStrings.aix = this.cast("aix")
  @scala.inline
  def android: typingsSlinky.node.nodeStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cygwin: typingsSlinky.node.nodeStrings.cygwin = this.cast("cygwin")
  @scala.inline
  def darwin: typingsSlinky.node.nodeStrings.darwin = this.cast("darwin")
  @scala.inline
  def freebsd: typingsSlinky.node.nodeStrings.freebsd = this.cast("freebsd")
  @scala.inline
  def linux: typingsSlinky.node.nodeStrings.linux = this.cast("linux")
  @scala.inline
  def netbsd: typingsSlinky.node.nodeStrings.netbsd = this.cast("netbsd")
  @scala.inline
  def openbsd: typingsSlinky.node.nodeStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def sunos: typingsSlinky.node.nodeStrings.sunos = this.cast("sunos")
  @scala.inline
  def win32: typingsSlinky.node.nodeStrings.win32 = this.cast("win32")
}

