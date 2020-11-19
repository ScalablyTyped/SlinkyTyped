package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaWait
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "saveSynonym")
@js.native
object saveSynonym extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* synonym */ Synonym, 
    /* requestOptions */ js.UndefOr[RequestOptions with SaveSynonymsOptions], 
    ReadonlyWaitablePromiseSaWait
  ] = js.native
}
