package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "copyIndex")
@js.native
object copyIndex extends js.Object {
  
  def apply(base: SearchClient): js.Function3[
    /* from */ String, 
    /* to */ String, 
    /* requestOptions */ js.UndefOr[CopyIndexOptions with RequestOptions], 
    ReadonlyWaitablePromiseIn
  ] = js.native
}
