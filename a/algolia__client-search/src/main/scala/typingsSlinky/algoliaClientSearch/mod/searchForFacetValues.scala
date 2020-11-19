package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchForF
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "searchForFacetValues")
@js.native
object searchForFacetValues extends js.Object {
  
  def apply(base: SearchIndex): js.Function3[
    /* facetName */ String, 
    /* facetQuery */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions with SearchOptions], 
    ReadonlyPromiseSearchForF
  ] = js.native
}
