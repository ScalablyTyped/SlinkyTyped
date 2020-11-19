package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.CommentAdded
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Local
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Remote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the comments that raised the "CommentAdded" event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait CommentAddedEventArgs extends js.Object {
  
  /**
    *
    * Gets the `CommentDetail` array that contains the comment ID and IDs of its related replies.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var commentDetails: js.Array[CommentDetail] = js.native
  
  /**
    *
    * Specifies the source of the event. See `Excel.EventSource` for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: CommentAdded = js.native
  
  /**
    *
    * Gets the ID of the worksheet in which the event happened.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String = js.native
}
object CommentAddedEventArgs {
  
  @scala.inline
  def apply(
    commentDetails: js.Array[CommentDetail],
    source: EventSource | Local | Remote,
    `type`: CommentAdded,
    worksheetId: String
  ): CommentAddedEventArgs = {
    val __obj = js.Dynamic.literal(commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentAddedEventArgs]
  }
  
  @scala.inline
  implicit class CommentAddedEventArgsOps[Self <: CommentAddedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommentDetailsVarargs(value: CommentDetail*): Self = this.set("commentDetails", js.Array(value :_*))
    
    @scala.inline
    def setCommentDetails(value: js.Array[CommentDetail]): Self = this.set("commentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CommentAdded): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
}
