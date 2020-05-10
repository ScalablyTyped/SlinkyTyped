package typingsSlinky.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid returning boolean values
  * to indicate whether an event was handled or not.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.draftJs.draftJsStrings.handled
  - typingsSlinky.draftJs.draftJsStrings.`not-handled`
*/
trait DraftHandleValue extends js.Object

object DraftHandleValue {
  @scala.inline
  def handled: typingsSlinky.draftJs.draftJsStrings.handled = "handled".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.handled]
  @scala.inline
  def `not-handled`: typingsSlinky.draftJs.draftJsStrings.`not-handled` = "not-handled".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`not-handled`]
}

