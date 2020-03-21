package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.viewer
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sharer
*/
trait ScreenSharingRole extends js.Object

object ScreenSharingRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sharer: typingsSlinky.microsoftGraph.microsoftGraphStrings.sharer = this.cast("sharer")
  @scala.inline
  def viewer: typingsSlinky.microsoftGraph.microsoftGraphStrings.viewer = this.cast("viewer")
}

