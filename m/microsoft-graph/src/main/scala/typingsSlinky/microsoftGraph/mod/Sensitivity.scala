package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.normal
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.personal
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.`private`
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.confidential
*/
trait Sensitivity extends js.Object

object Sensitivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confidential: typingsSlinky.microsoftGraph.microsoftGraphStrings.confidential = this.cast("confidential")
  @scala.inline
  def normal: typingsSlinky.microsoftGraph.microsoftGraphStrings.normal = this.cast("normal")
  @scala.inline
  def personal: typingsSlinky.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def `private`: typingsSlinky.microsoftGraph.microsoftGraphStrings.`private` = this.cast("private")
}

