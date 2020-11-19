package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchUser
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "searchUserIDs")
@js.native
object searchUserIDs extends js.Object {
  
  def apply(base: SearchClient): js.Function2[
    /* query */ String, 
    /* requestOptions */ js.UndefOr[SearchUserIDsOptions with RequestOptions], 
    ReadonlyPromiseSearchUser
  ] = js.native
}
