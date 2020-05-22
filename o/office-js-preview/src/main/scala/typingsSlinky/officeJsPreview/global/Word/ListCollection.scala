package typingsSlinky.officeJsPreview.global.Word

import typingsSlinky.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.List} objects.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.ListCollection")
@js.native
class ListCollection ()
  extends typingsSlinky.officeJsPreview.Word.ListCollection {
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

