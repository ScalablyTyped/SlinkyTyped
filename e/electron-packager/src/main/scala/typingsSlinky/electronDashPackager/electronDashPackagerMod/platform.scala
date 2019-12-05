package typingsSlinky.electronDashPackager.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.electronDashPackager.electronDashPackagerStrings.linux
  - typings.electronDashPackager.electronDashPackagerStrings.win32
  - typings.electronDashPackager.electronDashPackagerStrings.darwin
  - typings.electronDashPackager.electronDashPackagerStrings.mas
  - typings.electronDashPackager.electronDashPackagerStrings.all
*/
trait platform extends js.Object

object platform {
  @scala.inline
  def all: typingsSlinky.electronDashPackager.electronDashPackagerStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typingsSlinky.electronDashPackager.electronDashPackagerStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typingsSlinky.electronDashPackager.electronDashPackagerStrings.linux = this.cast("linux")
  @scala.inline
  def mas: typingsSlinky.electronDashPackager.electronDashPackagerStrings.mas = this.cast("mas")
  @scala.inline
  def win32: typingsSlinky.electronDashPackager.electronDashPackagerStrings.win32 = this.cast("win32")
}

