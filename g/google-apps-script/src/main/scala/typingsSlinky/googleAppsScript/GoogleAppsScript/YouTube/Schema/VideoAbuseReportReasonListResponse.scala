package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAbuseReportReasonListResponse extends js.Object {
  
  var etag: js.UndefOr[String] = js.native
  
  var eventId: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[VideoAbuseReportReason]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var visitorId: js.UndefOr[String] = js.native
}
object VideoAbuseReportReasonListResponse {
  
  @scala.inline
  def apply(): VideoAbuseReportReasonListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReportReasonListResponse]
  }
  
  @scala.inline
  implicit class VideoAbuseReportReasonListResponseOps[Self <: VideoAbuseReportReasonListResponse] (val x: Self) extends AnyVal {
    
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
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: VideoAbuseReportReason*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[VideoAbuseReportReason]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setVisitorId(value: String): Self = this.set("visitorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitorId: Self = this.set("visitorId", js.undefined)
  }
}
