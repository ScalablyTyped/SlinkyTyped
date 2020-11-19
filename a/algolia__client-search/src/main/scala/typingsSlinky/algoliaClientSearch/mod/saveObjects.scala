package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "saveObjects")
@js.native
object saveObjects extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* objects */ js.Array[Record[String, _]], 
    /* requestOptions */ js.UndefOr[RequestOptions with ChunkOptions with SaveObjectsOptions], 
    ReadonlyWaitablePromiseCh
  ] = js.native
}
