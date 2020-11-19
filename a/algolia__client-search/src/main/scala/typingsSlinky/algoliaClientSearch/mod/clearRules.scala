package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "clearRules")
@js.native
object clearRules extends js.Object {
  
  def apply(base: SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[RequestOptions with ClearRulesOptions], 
    ReadonlyWaitablePromiseDe
  ] = js.native
}
