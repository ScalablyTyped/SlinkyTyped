package typingsSlinky.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Platforms that have been supported by the official Electron prebuilt binaries, past and present.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.electronPackager.electronPackagerStrings.linux
  - typingsSlinky.electronPackager.electronPackagerStrings.win32
  - typingsSlinky.electronPackager.electronPackagerStrings.darwin
  - typingsSlinky.electronPackager.electronPackagerStrings.mas
*/
trait OfficialPlatform extends js.Object

object OfficialPlatform {
  @scala.inline
  def darwin: typingsSlinky.electronPackager.electronPackagerStrings.darwin = "darwin".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.darwin]
  @scala.inline
  def linux: typingsSlinky.electronPackager.electronPackagerStrings.linux = "linux".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.linux]
  @scala.inline
  def mas: typingsSlinky.electronPackager.electronPackagerStrings.mas = "mas".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.mas]
  @scala.inline
  def win32: typingsSlinky.electronPackager.electronPackagerStrings.win32 = "win32".asInstanceOf[typingsSlinky.electronPackager.electronPackagerStrings.win32]
}

