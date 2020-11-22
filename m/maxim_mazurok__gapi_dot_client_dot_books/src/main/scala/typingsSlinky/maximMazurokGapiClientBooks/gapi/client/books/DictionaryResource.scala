package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBooks.anon.Cpksver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictionaryResource extends js.Object {
  
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(): Request[Metadata] = js.native
  def listOfflineMetadata(request: Cpksver): Request[Metadata] = js.native
}
