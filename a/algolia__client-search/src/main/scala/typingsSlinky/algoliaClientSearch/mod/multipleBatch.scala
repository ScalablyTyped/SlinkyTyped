package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseMu
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "multipleBatch")
@js.native
object multipleBatch extends js.Object {
  
  def apply(base: SearchClient): js.Function2[
    /* requests */ js.Array[MultipleBatchRequest], 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseMu
  ] = js.native
}
