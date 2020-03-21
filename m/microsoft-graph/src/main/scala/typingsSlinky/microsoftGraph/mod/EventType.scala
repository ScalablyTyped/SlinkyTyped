package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.singleInstance
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.occurrence
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.exception
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.seriesMaster
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exception: typingsSlinky.microsoftGraph.microsoftGraphStrings.exception = this.cast("exception")
  @scala.inline
  def occurrence: typingsSlinky.microsoftGraph.microsoftGraphStrings.occurrence = this.cast("occurrence")
  @scala.inline
  def seriesMaster: typingsSlinky.microsoftGraph.microsoftGraphStrings.seriesMaster = this.cast("seriesMaster")
  @scala.inline
  def singleInstance: typingsSlinky.microsoftGraph.microsoftGraphStrings.singleInstance = this.cast("singleInstance")
}

