package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.IndexName_
import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseArraySearc
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "multipleSearchForFacetValues")
@js.native
object multipleSearchForFacetValues extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* queries */ js.Array[IndexName_], 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseArraySearc
  ] = js.native
}

