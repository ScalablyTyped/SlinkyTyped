package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.internal
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.external
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.externalPartner
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.externalNonPartner
*/
trait RecipientScopeType extends js.Object

object RecipientScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsSlinky.microsoftGraph.microsoftGraphStrings.external = this.cast("external")
  @scala.inline
  def externalNonPartner: typingsSlinky.microsoftGraph.microsoftGraphStrings.externalNonPartner = this.cast("externalNonPartner")
  @scala.inline
  def externalPartner: typingsSlinky.microsoftGraph.microsoftGraphStrings.externalPartner = this.cast("externalPartner")
  @scala.inline
  def internal: typingsSlinky.microsoftGraph.microsoftGraphStrings.internal = this.cast("internal")
  @scala.inline
  def none: none_ = this.cast("none")
}

