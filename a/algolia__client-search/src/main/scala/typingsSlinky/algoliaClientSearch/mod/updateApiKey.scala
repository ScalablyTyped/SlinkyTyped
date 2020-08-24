package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseUp
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "updateApiKey")
@js.native
object updateApiKey extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* apiKey */ String, 
    /* requestOptions */ js.UndefOr[UpdateApiKeyOptions with (Pick[RequestOptions, String | Double])], 
    ReadonlyWaitablePromiseUp
  ] = js.native
}

