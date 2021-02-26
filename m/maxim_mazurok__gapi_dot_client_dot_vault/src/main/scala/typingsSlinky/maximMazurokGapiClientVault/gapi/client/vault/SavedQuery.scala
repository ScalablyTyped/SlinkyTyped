package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedQuery extends StObject {
  
  /** Output only. The server generated timestamp at which saved query was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Name of the saved query. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The matter ID of the associated matter. The server does not look at this field during create and always uses matter id in the URL. */
  var matterId: js.UndefOr[String] = js.native
  
  /** The underlying Query object which contains all the information of the saved query. */
  var query: js.UndefOr[Query] = js.native
  
  /** A unique identifier for the saved query. */
  var savedQueryId: js.UndefOr[String] = js.native
}
object SavedQuery {
  
  @scala.inline
  def apply(): SavedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedQuery]
  }
  
  @scala.inline
  implicit class SavedQueryMutableBuilder[Self <: SavedQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSavedQueryId(value: String): Self = StObject.set(x, "savedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedQueryIdUndefined: Self = StObject.set(x, "savedQueryId", js.undefined)
  }
}
