package typingsSlinky.algoliaClientAccount.mod

import typingsSlinky.algoliaClientCommon.mod.WaitablePromise
import typingsSlinky.algoliaClientSearch.mod.SearchIndex
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-account", "accountCopyIndex")
@js.native
object accountCopyIndex extends js.Object {
  def apply(source: SearchIndex, destination: SearchIndex): WaitablePromise[Unit] = js.native
  def apply(source: SearchIndex, destination: SearchIndex, requestOptions: RequestOptions): WaitablePromise[Unit] = js.native
}

