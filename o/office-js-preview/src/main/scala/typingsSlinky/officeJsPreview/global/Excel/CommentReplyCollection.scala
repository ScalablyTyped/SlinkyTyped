package typingsSlinky.officeJsPreview.global.Excel

import typingsSlinky.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of comment reply objects that are part of the comment.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.CommentReplyCollection")
@js.native
class CommentReplyCollection ()
  extends typingsSlinky.officeJsPreview.Excel.CommentReplyCollection {
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

