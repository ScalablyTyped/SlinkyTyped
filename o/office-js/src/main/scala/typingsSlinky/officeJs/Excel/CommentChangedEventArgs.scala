package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.CommentChanged
import typingsSlinky.officeJs.officeJsStrings.CommentEdited
import typingsSlinky.officeJs.officeJsStrings.CommentReopened
import typingsSlinky.officeJs.officeJsStrings.CommentResolved
import typingsSlinky.officeJs.officeJsStrings.Local
import typingsSlinky.officeJs.officeJsStrings.Remote
import typingsSlinky.officeJs.officeJsStrings.ReplyAdded
import typingsSlinky.officeJs.officeJsStrings.ReplyDeleted
import typingsSlinky.officeJs.officeJsStrings.ReplyEdited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Occurs when existing comments are changed.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait CommentChangedEventArgs extends js.Object {
  
  /**
    *
    * Gets the change type that represents how the changed event is triggered.
    *
    * [Api set: ExcelApi 1.12]
    */
  var changeType: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited = js.native
  
  /**
    *
    * Get the CommentDetail array which contains the comment Id and Ids of its related replies.
    *
    * [Api set: ExcelApi 1.12]
    */
  var commentDetails: js.Array[CommentDetail] = js.native
  
  /**
    *
    * Specifies the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.12]
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.12]
    */
  var `type`: CommentChanged = js.native
  
  /**
    *
    * Gets the Id of the worksheet in which the event happened.
    *
    * [Api set: ExcelApi 1.12]
    */
  var worksheetId: String = js.native
}
object CommentChangedEventArgs {
  
  @scala.inline
  def apply(
    changeType: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited,
    commentDetails: js.Array[CommentDetail],
    source: EventSource | Local | Remote,
    `type`: CommentChanged,
    worksheetId: String
  ): CommentChangedEventArgs = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], commentDetails = commentDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentChangedEventArgs]
  }
  
  @scala.inline
  implicit class CommentChangedEventArgsOps[Self <: CommentChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setChangeType(
      value: CommentChangeType | CommentEdited | CommentResolved | CommentReopened | ReplyAdded | ReplyDeleted | ReplyEdited
    ): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentDetailsVarargs(value: CommentDetail*): Self = this.set("commentDetails", js.Array(value :_*))
    
    @scala.inline
    def setCommentDetails(value: js.Array[CommentDetail]): Self = this.set("commentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CommentChanged): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
}
