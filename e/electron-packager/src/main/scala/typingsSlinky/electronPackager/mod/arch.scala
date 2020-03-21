package typingsSlinky.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.electronPackager.electronPackagerStrings.ia32
  - typingsSlinky.electronPackager.electronPackagerStrings.x64
  - typingsSlinky.electronPackager.electronPackagerStrings.armv7l
  - typingsSlinky.electronPackager.electronPackagerStrings.arm64
  - typingsSlinky.electronPackager.electronPackagerStrings.mips64el
  - typingsSlinky.electronPackager.electronPackagerStrings.all
*/
trait arch extends js.Object

object arch {
  @scala.inline
  def all: typingsSlinky.electronPackager.electronPackagerStrings.all = this.cast("all")
  @scala.inline
  def arm64: typingsSlinky.electronPackager.electronPackagerStrings.arm64 = this.cast("arm64")
  @scala.inline
  def armv7l: typingsSlinky.electronPackager.electronPackagerStrings.armv7l = this.cast("armv7l")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typingsSlinky.electronPackager.electronPackagerStrings.ia32 = this.cast("ia32")
  @scala.inline
  def mips64el: typingsSlinky.electronPackager.electronPackagerStrings.mips64el = this.cast("mips64el")
  @scala.inline
  def x64: typingsSlinky.electronPackager.electronPackagerStrings.x64 = this.cast("x64")
}

