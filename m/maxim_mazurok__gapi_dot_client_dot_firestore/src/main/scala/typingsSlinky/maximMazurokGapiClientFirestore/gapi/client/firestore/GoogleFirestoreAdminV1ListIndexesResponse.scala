package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFirestoreAdminV1ListIndexesResponse extends js.Object {
  
  /** The requested indexes. */
  var indexes: js.UndefOr[js.Array[GoogleFirestoreAdminV1Index]] = js.native
  
  /** A page token that may be used to request another page of results. If blank, this is the last page. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleFirestoreAdminV1ListIndexesResponse {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ListIndexesResponse]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1ListIndexesResponseOps[Self <: GoogleFirestoreAdminV1ListIndexesResponse] (val x: Self) extends AnyVal {
    
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
    def setIndexesVarargs(value: GoogleFirestoreAdminV1Index*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[GoogleFirestoreAdminV1Index]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
