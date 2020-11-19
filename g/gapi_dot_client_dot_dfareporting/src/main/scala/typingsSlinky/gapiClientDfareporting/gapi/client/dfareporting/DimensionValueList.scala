package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionValueList extends js.Object {
  
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  
  /** The dimension values returned in this response. */
  var items: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The kind of list this is, in this case dfareporting#dimensionValueList. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Continuation token used to page through dimension values. To retrieve the next page of results, set the next request's "pageToken" to the value of this
    * field. The page token is only valid for a limited amount of time and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object DimensionValueList {
  
  @scala.inline
  def apply(): DimensionValueList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValueList]
  }
  
  @scala.inline
  implicit class DimensionValueListOps[Self <: DimensionValueList] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: DimensionValue*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[DimensionValue]): Self = this.set("items", value.asInstanceOf[js.Any])
    
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
