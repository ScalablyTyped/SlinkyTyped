package typingsSlinky.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBigquerydatatransfer.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferLogsResource extends StObject {
  
  /** Returns user facing log messages for the data transfer run. */
  def list(): Request[ListTransferLogsResponse] = js.native
  def list(request: Fields): Request[ListTransferLogsResponse] = js.native
}
