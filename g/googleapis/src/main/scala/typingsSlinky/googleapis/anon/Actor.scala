package typingsSlinky.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actor extends js.Object {
  
  var actor: js.UndefOr[Verification] = js.native
  
  var attachments: js.UndefOr[js.Array[Content]] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var objectType: js.UndefOr[String] = js.native
  
  var originalContent: js.UndefOr[String] = js.native
  
  var plusoners: js.UndefOr[SelfLink] = js.native
  
  var replies: js.UndefOr[SelfLink] = js.native
  
  var resharers: js.UndefOr[SelfLink] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Actor {
  
  @scala.inline
  def apply(): Actor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actor]
  }
  
  @scala.inline
  implicit class ActorOps[Self <: Actor] (val x: Self) extends AnyVal {
    
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
    def setActor(value: Verification): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: Content*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[Content]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    
    @scala.inline
    def setOriginalContent(value: String): Self = this.set("originalContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalContent: Self = this.set("originalContent", js.undefined)
    
    @scala.inline
    def setPlusoners(value: SelfLink): Self = this.set("plusoners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlusoners: Self = this.set("plusoners", js.undefined)
    
    @scala.inline
    def setReplies(value: SelfLink): Self = this.set("replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    
    @scala.inline
    def setResharers(value: SelfLink): Self = this.set("resharers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResharers: Self = this.set("resharers", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
