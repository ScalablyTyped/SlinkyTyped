package typingsSlinky.nodeOsUtils.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.aix
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.android
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.darwin
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.freebsd
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.linux
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.openbsd
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.sunos
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.win32
  - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.cygwin
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def aix: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.aix = this.cast("aix")
  @scala.inline
  def android: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cygwin: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.cygwin = this.cast("cygwin")
  @scala.inline
  def darwin: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.darwin = this.cast("darwin")
  @scala.inline
  def freebsd: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.freebsd = this.cast("freebsd")
  @scala.inline
  def linux: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.linux = this.cast("linux")
  @scala.inline
  def openbsd: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def sunos: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.sunos = this.cast("sunos")
  @scala.inline
  def win32: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.win32 = this.cast("win32")
}

