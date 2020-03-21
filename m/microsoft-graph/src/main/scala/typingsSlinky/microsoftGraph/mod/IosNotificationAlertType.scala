package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.banner
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.modal
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
*/
trait IosNotificationAlertType extends js.Object

object IosNotificationAlertType {
  @scala.inline
  def banner: typingsSlinky.microsoftGraph.microsoftGraphStrings.banner = this.cast("banner")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def modal: typingsSlinky.microsoftGraph.microsoftGraphStrings.modal = this.cast("modal")
  @scala.inline
  def none: none_ = this.cast("none")
}

