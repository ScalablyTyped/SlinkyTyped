package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "saveSynonyms")
@js.native
object saveSynonyms extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* synonyms */ js.Array[Synonym], 
    /* requestOptions */ js.UndefOr[SaveSynonymsOptions with RequestOptions], 
    ReadonlyWaitablePromiseSaCatch
  ] = js.native
}

