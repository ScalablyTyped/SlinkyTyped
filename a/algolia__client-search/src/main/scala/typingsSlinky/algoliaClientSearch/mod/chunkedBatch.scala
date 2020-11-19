package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "chunkedBatch")
@js.native
object chunkedBatch extends js.Object {
  
  def apply(base: SearchIndex): js.Function3[
    /* bodies */ js.Array[js.Object], 
    /* action */ BatchActionType, 
    /* requestOptions */ js.UndefOr[RequestOptions with ChunkOptions], 
    ReadonlyWaitablePromiseCh
  ] = js.native
}
