package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of comment reply objects that are part of the comment.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait CommentReplyCollectionLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the email of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the comment reply identifier.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The entities (e.g., people) that are mentioned in comments.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The comment reply status. A value of "true" means the reply is in the resolved state.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[Boolean] = js.native
}
object CommentReplyCollectionLoadOptions {
  
  @scala.inline
  def apply(): CommentReplyCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class CommentReplyCollectionLoadOptionsOps[Self <: CommentReplyCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setAuthorEmail(value: Boolean): Self = this.set("authorEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorEmail: Self = this.set("authorEmail", js.undefined)
    
    @scala.inline
    def setAuthorName(value: Boolean): Self = this.set("authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorName: Self = this.set("authorName", js.undefined)
    
    @scala.inline
    def setContent(value: Boolean): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Boolean): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMentions(value: Boolean): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    
    @scala.inline
    def setResolved(value: Boolean): Self = this.set("resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolved: Self = this.set("resolved", js.undefined)
    
    @scala.inline
    def setRichContent(value: Boolean): Self = this.set("richContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRichContent: Self = this.set("richContent", js.undefined)
  }
}
