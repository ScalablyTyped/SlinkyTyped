package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Owner
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Contributor
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Reader
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.None
*/
trait OnenoteUserRole extends js.Object

object OnenoteUserRole {
  @scala.inline
  def Contributor: typingsSlinky.microsoftGraph.microsoftGraphStrings.Contributor = this.cast("Contributor")
  @scala.inline
  def None: typingsSlinky.microsoftGraph.microsoftGraphStrings.None = this.cast("None")
  @scala.inline
  def Owner: typingsSlinky.microsoftGraph.microsoftGraphStrings.Owner = this.cast("Owner")
  @scala.inline
  def Reader: typingsSlinky.microsoftGraph.microsoftGraphStrings.Reader = this.cast("Reader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

