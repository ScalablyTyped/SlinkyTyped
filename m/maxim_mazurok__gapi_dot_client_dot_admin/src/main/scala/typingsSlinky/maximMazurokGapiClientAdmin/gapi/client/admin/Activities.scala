package typingsSlinky.maximMazurokGapiClientAdmin.gapi.client.admin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activities extends js.Object {
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** Each activity record in the response. */
  var items: js.UndefOr[js.Array[Activity]] = js.native
  
  /** The type of API resource. For an activity report, the value is reports#activities. */
  var kind: js.UndefOr[String] = js.native
  
  /** Token for retrieving the follow-on next page of the report. The nextPageToken value is used in the request's pageToken query string. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object Activities {
  
  @scala.inline
  def apply(): Activities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activities]
  }
  
  @scala.inline
  implicit class ActivitiesOps[Self <: Activities] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Activity*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Activity]): Self = this.set("items", value.asInstanceOf[js.Any])
    
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
