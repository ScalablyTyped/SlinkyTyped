package typingsSlinky.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasPendingMappingsOptions extends StObject {
  
  /**
    * If the clusters pending mapping state should be on the response.
    *
    * @defaultValue false
    *
    * @internal
    */
  val getClusters: js.UndefOr[Boolean] = js.native
  
  /**
    * If the clusters pending mapping state should be on the response.
    *
    * @defaultValue false
    */
  val retrieveMappings: js.UndefOr[Boolean] = js.native
}
object HasPendingMappingsOptions {
  
  @scala.inline
  def apply(): HasPendingMappingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasPendingMappingsOptions]
  }
  
  @scala.inline
  implicit class HasPendingMappingsOptionsMutableBuilder[Self <: HasPendingMappingsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClusters(value: Boolean): Self = StObject.set(x, "getClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClustersUndefined: Self = StObject.set(x, "getClusters", js.undefined)
    
    @scala.inline
    def setRetrieveMappings(value: Boolean): Self = StObject.set(x, "retrieveMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveMappingsUndefined: Self = StObject.set(x, "retrieveMappings", js.undefined)
  }
}
