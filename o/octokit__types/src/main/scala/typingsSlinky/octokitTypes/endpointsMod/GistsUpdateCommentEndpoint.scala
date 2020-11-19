package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsUpdateCommentEndpoint extends js.Object {
  
  /**
    * The comment text.
    */
  var body: String = js.native
  
  var comment_id: Double = js.native
  
  var gist_id: String = js.native
}
object GistsUpdateCommentEndpoint {
  
  @scala.inline
  def apply(body: String, comment_id: Double, gist_id: String): GistsUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateCommentEndpoint]
  }
  
  @scala.inline
  implicit class GistsUpdateCommentEndpointOps[Self <: GistsUpdateCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_id(value: Double): Self = this.set("comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGist_id(value: String): Self = this.set("gist_id", value.asInstanceOf[js.Any])
  }
}
