package typingsSlinky.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.electronPackager.electronPackagerStrings.linux
  - typingsSlinky.electronPackager.electronPackagerStrings.win32
  - typingsSlinky.electronPackager.electronPackagerStrings.darwin
  - typingsSlinky.electronPackager.electronPackagerStrings.mas
  - typingsSlinky.electronPackager.electronPackagerStrings.all
*/
trait platform extends js.Object

object platform {
  @scala.inline
  def all: typingsSlinky.electronPackager.electronPackagerStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typingsSlinky.electronPackager.electronPackagerStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typingsSlinky.electronPackager.electronPackagerStrings.linux = this.cast("linux")
  @scala.inline
  def mas: typingsSlinky.electronPackager.electronPackagerStrings.mas = this.cast("mas")
  @scala.inline
  def win32: typingsSlinky.electronPackager.electronPackagerStrings.win32 = this.cast("win32")
}

