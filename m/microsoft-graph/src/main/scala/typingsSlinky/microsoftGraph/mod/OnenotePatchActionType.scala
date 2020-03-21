package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Replace
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Append
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Delete
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Insert
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Prepend
*/
trait OnenotePatchActionType extends js.Object

object OnenotePatchActionType {
  @scala.inline
  def Append: typingsSlinky.microsoftGraph.microsoftGraphStrings.Append = this.cast("Append")
  @scala.inline
  def Delete: typingsSlinky.microsoftGraph.microsoftGraphStrings.Delete = this.cast("Delete")
  @scala.inline
  def Insert: typingsSlinky.microsoftGraph.microsoftGraphStrings.Insert = this.cast("Insert")
  @scala.inline
  def Prepend: typingsSlinky.microsoftGraph.microsoftGraphStrings.Prepend = this.cast("Prepend")
  @scala.inline
  def Replace: typingsSlinky.microsoftGraph.microsoftGraphStrings.Replace = this.cast("Replace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

