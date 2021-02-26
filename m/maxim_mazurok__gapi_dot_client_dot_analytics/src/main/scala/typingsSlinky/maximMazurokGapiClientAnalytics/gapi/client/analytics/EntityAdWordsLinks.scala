package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityAdWordsLinks extends StObject {
  
  /** A list of entity Google Ads links. */
  var items: js.UndefOr[js.Array[EntityAdWordsLink]] = js.native
  
  /**
    * The maximum number of entries the response can contain, regardless of the actual number of entries returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or
    * otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  /** Collection type. */
  var kind: js.UndefOr[String] = js.native
  
  /** Next link for this Google Ads link collection. */
  var nextLink: js.UndefOr[String] = js.native
  
  /** Previous link for this Google Ads link collection. */
  var previousLink: js.UndefOr[String] = js.native
  
  /** The starting index of the entries, which is 1 by default or otherwise specified by the start-index query parameter. */
  var startIndex: js.UndefOr[Double] = js.native
  
  /** The total number of results for the query, regardless of the number of results in the response. */
  var totalResults: js.UndefOr[Double] = js.native
}
object EntityAdWordsLinks {
  
  @scala.inline
  def apply(): EntityAdWordsLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityAdWordsLinks]
  }
  
  @scala.inline
  implicit class EntityAdWordsLinksMutableBuilder[Self <: EntityAdWordsLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[EntityAdWordsLink]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: EntityAdWordsLink*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    @scala.inline
    def setPreviousLink(value: String): Self = StObject.set(x, "previousLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousLinkUndefined: Self = StObject.set(x, "previousLink", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
