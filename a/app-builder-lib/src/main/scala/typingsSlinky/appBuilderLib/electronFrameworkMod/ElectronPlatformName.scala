package typingsSlinky.appBuilderLib.electronFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.darwin
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.linux
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.win32
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.mas
*/
trait ElectronPlatformName extends js.Object

object ElectronPlatformName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typingsSlinky.appBuilderLib.appBuilderLibStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typingsSlinky.appBuilderLib.appBuilderLibStrings.linux = this.cast("linux")
  @scala.inline
  def mas: typingsSlinky.appBuilderLib.appBuilderLibStrings.mas = this.cast("mas")
  @scala.inline
  def win32: typingsSlinky.appBuilderLib.appBuilderLibStrings.win32 = this.cast("win32")
}

