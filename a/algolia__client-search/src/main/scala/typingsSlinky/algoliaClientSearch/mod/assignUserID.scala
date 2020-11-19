package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseAssignUser
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "assignUserID")
@js.native
object assignUserID extends js.Object {
  
  def apply(base: SearchClient): js.Function3[
    /* userID */ String, 
    /* clusterName */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseAssignUser
  ] = js.native
}
