package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "getObjects")
@js.native
object getObjects extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* objectIDs */ js.Array[String], 
    /* requestOptions */ js.UndefOr[RequestOptions with GetObjectsOptions], 
    js.Promise[GetObjectsResponse[_]]
  ] = js.native
}
