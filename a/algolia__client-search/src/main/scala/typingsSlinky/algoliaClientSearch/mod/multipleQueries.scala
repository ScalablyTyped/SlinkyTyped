package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "multipleQueries")
@js.native
object multipleQueries extends js.Object {
  
  def apply(base: SearchClient): js.Function2[
    /* queries */ js.Array[MultipleQueriesQuery], 
    /* requestOptions */ js.UndefOr[RequestOptions with MultipleQueriesOptions], 
    js.Promise[MultipleQueriesResponse[_]]
  ] = js.native
}
