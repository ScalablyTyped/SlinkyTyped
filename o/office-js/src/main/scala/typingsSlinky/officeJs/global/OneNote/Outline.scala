package typingsSlinky.officeJs.global.OneNote

import typingsSlinky.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a container for Paragraph objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.Outline")
@js.native
class Outline ()
  extends typingsSlinky.officeJs.OneNote.Outline {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
}

