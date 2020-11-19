package typingsSlinky.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the `Pull` method.
  */
@js.native
trait SchemaPullRequest extends js.Object {
  
  /**
    * The maximum number of messages returned for this request. The Pub/Sub
    * system may return fewer than the number specified.
    */
  var maxMessages: js.UndefOr[Double] = js.native
  
  /**
    * If this field set to true, the system will respond immediately even if it
    * there are no messages available to return in the `Pull` response.
    * Otherwise, the system may wait (for a bounded amount of time) until at
    * least one message is available, rather than returning no messages.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
}
object SchemaPullRequest {
  
  @scala.inline
  def apply(): SchemaPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullRequest]
  }
  
  @scala.inline
  implicit class SchemaPullRequestOps[Self <: SchemaPullRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxMessages(value: Double): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMessages: Self = this.set("maxMessages", js.undefined)
    
    @scala.inline
    def setReturnImmediately(value: Boolean): Self = this.set("returnImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnImmediately: Self = this.set("returnImmediately", js.undefined)
  }
}
