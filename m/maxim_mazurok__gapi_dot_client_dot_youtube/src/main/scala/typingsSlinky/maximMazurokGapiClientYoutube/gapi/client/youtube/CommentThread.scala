package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentThread extends js.Object {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The ID that YouTube uses to uniquely identify the comment thread. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#commentThread". */
  var kind: js.UndefOr[String] = js.native
  
  /** The replies object contains a limited number of replies (if any) to the top level comment found in the snippet. */
  var replies: js.UndefOr[CommentThreadReplies] = js.native
  
  /** The snippet object contains basic details about the comment thread and also the top level comment. */
  var snippet: js.UndefOr[CommentThreadSnippet] = js.native
}
object CommentThread {
  
  @scala.inline
  def apply(): CommentThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentThread]
  }
  
  @scala.inline
  implicit class CommentThreadOps[Self <: CommentThread] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setReplies(value: CommentThreadReplies): Self = this.set("replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    
    @scala.inline
    def setSnippet(value: CommentThreadSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
}
