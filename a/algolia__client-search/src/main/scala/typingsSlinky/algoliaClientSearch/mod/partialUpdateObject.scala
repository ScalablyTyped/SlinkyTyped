package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromisePa
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "partialUpdateObject")
@js.native
object partialUpdateObject extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* object */ Record[String, _], 
    /* requestOptions */ js.UndefOr[RequestOptions with ChunkOptions with PartialUpdateObjectsOptions], 
    ReadonlyWaitablePromisePa
  ] = js.native
}

