package typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.Alt
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineitemsResource extends js.Object {
  
  /** Retrieves line items in CSV format. YouTube & partners line items are not supported. */
  def downloadlineitems(request: Accesstoken): Request[DownloadLineItemsResponse] = js.native
  def downloadlineitems(request: Alt, body: DownloadLineItemsRequest): Request[DownloadLineItemsResponse] = js.native
  
  def uploadlineitems(request: Alt, body: UploadLineItemsRequest): Request[UploadLineItemsResponse] = js.native
  /** Uploads line items in CSV format. YouTube & partners line items are not supported. */
  def uploadlineitems(request: Callback): Request[UploadLineItemsResponse] = js.native
}
