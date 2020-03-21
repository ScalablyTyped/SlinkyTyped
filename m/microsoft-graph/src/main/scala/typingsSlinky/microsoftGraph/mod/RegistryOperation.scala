package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.delete_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.create
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.modify
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.delete_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RegistryOperation extends js.Object

object RegistryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsSlinky.microsoftGraph.microsoftGraphStrings.create = this.cast("create")
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def modify: typingsSlinky.microsoftGraph.microsoftGraphStrings.modify = this.cast("modify")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

