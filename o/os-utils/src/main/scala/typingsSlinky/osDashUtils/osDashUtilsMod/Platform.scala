package typingsSlinky.osDashUtils.osDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.osDashUtils.osDashUtilsStrings.aix
  - typings.osDashUtils.osDashUtilsStrings.android
  - typings.osDashUtils.osDashUtilsStrings.darwin
  - typings.osDashUtils.osDashUtilsStrings.freebsd
  - typings.osDashUtils.osDashUtilsStrings.linux
  - typings.osDashUtils.osDashUtilsStrings.openbsd
  - typings.osDashUtils.osDashUtilsStrings.sunos
  - typings.osDashUtils.osDashUtilsStrings.win32
  - typings.osDashUtils.osDashUtilsStrings.cygwin
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def aix: typingsSlinky.osDashUtils.osDashUtilsStrings.aix = this.cast("aix")
  @scala.inline
  def android: typingsSlinky.osDashUtils.osDashUtilsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cygwin: typingsSlinky.osDashUtils.osDashUtilsStrings.cygwin = this.cast("cygwin")
  @scala.inline
  def darwin: typingsSlinky.osDashUtils.osDashUtilsStrings.darwin = this.cast("darwin")
  @scala.inline
  def freebsd: typingsSlinky.osDashUtils.osDashUtilsStrings.freebsd = this.cast("freebsd")
  @scala.inline
  def linux: typingsSlinky.osDashUtils.osDashUtilsStrings.linux = this.cast("linux")
  @scala.inline
  def openbsd: typingsSlinky.osDashUtils.osDashUtilsStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def sunos: typingsSlinky.osDashUtils.osDashUtilsStrings.sunos = this.cast("sunos")
  @scala.inline
  def win32: typingsSlinky.osDashUtils.osDashUtilsStrings.win32 = this.cast("win32")
}

@JSImport("os-utils", "platform")
@js.native
object platform extends js.Object {
  def apply(): Platform = js.native
}

