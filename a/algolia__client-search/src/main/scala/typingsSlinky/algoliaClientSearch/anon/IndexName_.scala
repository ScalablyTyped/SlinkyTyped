package typingsSlinky.algoliaClientSearch.anon

import typingsSlinky.algoliaClientSearch.mod.SearchForFacetValuesQueryParams
import typingsSlinky.algoliaClientSearch.mod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexName_ extends StObject {
  
  val indexName: String = js.native
  
  val params: SearchForFacetValuesQueryParams with SearchOptions = js.native
}
object IndexName_ {
  
  @scala.inline
  def apply(indexName: String, params: SearchForFacetValuesQueryParams with SearchOptions): IndexName_ = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexName_]
  }
  
  @scala.inline
  implicit class IndexName_MutableBuilder[Self <: IndexName_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: SearchForFacetValuesQueryParams with SearchOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
