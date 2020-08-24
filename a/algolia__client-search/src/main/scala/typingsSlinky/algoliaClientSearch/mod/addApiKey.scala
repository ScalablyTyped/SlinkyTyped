package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseAd
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "addApiKey")
@js.native
object addApiKey extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* acl */ js.Array[ApiKeyACLType], 
    /* requestOptions */ js.UndefOr[AddApiKeyOptions with (Pick[RequestOptions, String | Double])], 
    ReadonlyWaitablePromiseAd
  ] = js.native
}

