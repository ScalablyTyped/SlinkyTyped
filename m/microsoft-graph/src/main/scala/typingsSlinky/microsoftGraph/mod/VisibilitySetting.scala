package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notConfigured
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.hide
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.show
*/
trait VisibilitySetting extends js.Object

object VisibilitySetting {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hide: typingsSlinky.microsoftGraph.microsoftGraphStrings.hide = this.cast("hide")
  @scala.inline
  def notConfigured: typingsSlinky.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
  @scala.inline
  def show: typingsSlinky.microsoftGraph.microsoftGraphStrings.show = this.cast("show")
}

