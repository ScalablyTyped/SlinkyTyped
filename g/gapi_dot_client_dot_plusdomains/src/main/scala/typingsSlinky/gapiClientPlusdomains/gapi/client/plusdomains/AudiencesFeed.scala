package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudiencesFeed extends js.Object {
  
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  
  /** The audiences in this result. */
  var items: js.UndefOr[js.Array[Audience]] = js.native
  
  /** Identifies this resource as a collection of audiences. Value: "plus#audienceFeed". */
  var kind: js.UndefOr[String] = js.native
  
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total number of ACL entries. The number of entries in this response may be smaller due to paging. */
  var totalItems: js.UndefOr[Double] = js.native
}
object AudiencesFeed {
  
  @scala.inline
  def apply(): AudiencesFeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudiencesFeed]
  }
  
  @scala.inline
  implicit class AudiencesFeedOps[Self <: AudiencesFeed] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Audience*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Audience]): Self = this.set("items", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
}
