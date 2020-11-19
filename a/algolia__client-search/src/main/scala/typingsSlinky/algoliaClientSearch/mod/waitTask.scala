package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "waitTask")
@js.native
object waitTask extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* taskID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromisevoid
  ] = js.native
}
