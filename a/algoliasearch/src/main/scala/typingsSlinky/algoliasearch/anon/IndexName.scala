package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliaClientSearch.mod.SearchForFacetValuesQueryParams
import typingsSlinky.algoliaClientSearch.mod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexName extends js.Object {
  
  val indexName: String = js.native
  
  val params: SearchForFacetValuesQueryParams with SearchOptions = js.native
}
object IndexName {
  
  @scala.inline
  def apply(indexName: String, params: SearchForFacetValuesQueryParams with SearchOptions): IndexName = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexName]
  }
  
  @scala.inline
  implicit class IndexNameOps[Self <: IndexName] (val x: Self) extends AnyVal {
    
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
    def setIndexName(value: String): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: SearchForFacetValuesQueryParams with SearchOptions): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
