package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch
import typingsSlinky.algoliaClientSearch.anon.RequestOptionsPickSaveSyn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "replaceAllSynonyms")
@js.native
object replaceAllSynonyms extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* synonyms */ js.Array[Synonym], 
    /* requestOptions */ js.UndefOr[RequestOptionsPickSaveSyn], 
    ReadonlyWaitablePromiseSaCatch
  ] = js.native
}
