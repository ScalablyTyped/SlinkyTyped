package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchResp
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "searchRules")
@js.native
object searchRules extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* query */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions with SearchRulesOptions], 
    ReadonlyPromiseSearchResp
  ] = js.native
}
