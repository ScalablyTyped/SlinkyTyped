package typingsSlinky.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileComment extends js.Object {
  
  /** The comment in the discussion thread. This identifier is an opaque string compatible with the Drive API; see https://developers.google.com/drive/v3/reference/comments/get */
  var legacyCommentId: js.UndefOr[String] = js.native
  
  /**
    * The discussion thread to which the comment was added. This identifier is an opaque string compatible with the Drive API and references the first comment in a discussion; see
    * https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyDiscussionId: js.UndefOr[String] = js.native
  
  /** The link to the discussion thread containing this comment, for example, "https://docs.google.com/DOCUMENT_ID/edit?disco=THREAD_ID". */
  var linkToDiscussion: js.UndefOr[String] = js.native
  
  /** The Drive item containing this comment. */
  var parent: js.UndefOr[DriveItem] = js.native
}
object FileComment {
  
  @scala.inline
  def apply(): FileComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileComment]
  }
  
  @scala.inline
  implicit class FileCommentOps[Self <: FileComment] (val x: Self) extends AnyVal {
    
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
    def setLegacyCommentId(value: String): Self = this.set("legacyCommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyCommentId: Self = this.set("legacyCommentId", js.undefined)
    
    @scala.inline
    def setLegacyDiscussionId(value: String): Self = this.set("legacyDiscussionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyDiscussionId: Self = this.set("legacyDiscussionId", js.undefined)
    
    @scala.inline
    def setLinkToDiscussion(value: String): Self = this.set("linkToDiscussion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkToDiscussion: Self = this.set("linkToDiscussion", js.undefined)
    
    @scala.inline
    def setParent(value: DriveItem): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
