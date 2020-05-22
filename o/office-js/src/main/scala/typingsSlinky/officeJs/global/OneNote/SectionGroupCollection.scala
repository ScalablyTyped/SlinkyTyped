package typingsSlinky.officeJs.global.OneNote

import typingsSlinky.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of section groups.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.SectionGroupCollection")
@js.native
class SectionGroupCollection ()
  extends typingsSlinky.officeJs.OneNote.SectionGroupCollection {
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

