package typingsSlinky.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineListResponse extends js.Object {
  
  /** Items in the timeline. */
  var items: js.UndefOr[js.Array[TimelineItem]] = js.native
  
  /** The type of resource. This is always mirror#timeline. */
  var kind: js.UndefOr[String] = js.native
  
  /** The next page token. Provide this as the pageToken parameter in the request to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object TimelineListResponse {
  
  @scala.inline
  def apply(): TimelineListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineListResponse]
  }
  
  @scala.inline
  implicit class TimelineListResponseOps[Self <: TimelineListResponse] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: TimelineItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TimelineItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
