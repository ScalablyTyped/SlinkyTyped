package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.fullScreen
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.nonFullScreen
*/
trait WindowsStartMenuModeType extends js.Object

object WindowsStartMenuModeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullScreen: typingsSlinky.microsoftGraph.microsoftGraphStrings.fullScreen = this.cast("fullScreen")
  @scala.inline
  def nonFullScreen: typingsSlinky.microsoftGraph.microsoftGraphStrings.nonFullScreen = this.cast("nonFullScreen")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

