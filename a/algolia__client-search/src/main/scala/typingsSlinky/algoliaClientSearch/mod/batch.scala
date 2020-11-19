package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseBa
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "batch")
@js.native
object batch extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* requests */ js.Array[BatchRequest], 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseBa
  ] = js.native
}
