package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseAssignUserCatch
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "assignUserIDs")
@js.native
object assignUserIDs extends js.Object {
  
  def apply(base: SearchClient): js.Function3[
    /* userIDs */ js.Array[String], 
    /* clusterName */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseAssignUserCatch
  ] = js.native
}
