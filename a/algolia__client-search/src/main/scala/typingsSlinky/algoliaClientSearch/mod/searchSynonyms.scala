package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchSyno
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "searchSynonyms")
@js.native
object searchSynonyms extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* query */ String, 
    /* requestOptions */ js.UndefOr[SearchSynonymsOptions with RequestOptions], 
    ReadonlyPromiseSearchSyno
  ] = js.native
}
