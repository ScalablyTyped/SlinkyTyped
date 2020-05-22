package typingsSlinky.officeJs.global.OneNote

import typingsSlinky.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell in a OneNote table.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.TableCell")
@js.native
class TableCell ()
  extends typingsSlinky.officeJs.OneNote.TableCell {
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

