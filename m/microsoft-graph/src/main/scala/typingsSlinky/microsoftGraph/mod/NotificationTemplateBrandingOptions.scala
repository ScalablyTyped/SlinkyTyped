package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.includeCompanyLogo
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.includeCompanyName
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.includeContactInformation
*/
trait NotificationTemplateBrandingOptions extends js.Object

object NotificationTemplateBrandingOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def includeCompanyLogo: typingsSlinky.microsoftGraph.microsoftGraphStrings.includeCompanyLogo = this.cast("includeCompanyLogo")
  @scala.inline
  def includeCompanyName: typingsSlinky.microsoftGraph.microsoftGraphStrings.includeCompanyName = this.cast("includeCompanyName")
  @scala.inline
  def includeContactInformation: typingsSlinky.microsoftGraph.microsoftGraphStrings.includeContactInformation = this.cast("includeContactInformation")
  @scala.inline
  def none: none_ = this.cast("none")
}

