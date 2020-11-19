package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseHasPending
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "hasPendingMappings")
@js.native
object hasPendingMappings extends js.Object {
  
  def apply(base: SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[HasPendingMappingsOptions with RequestOptions], 
    ReadonlyPromiseHasPending
  ] = js.native
}
