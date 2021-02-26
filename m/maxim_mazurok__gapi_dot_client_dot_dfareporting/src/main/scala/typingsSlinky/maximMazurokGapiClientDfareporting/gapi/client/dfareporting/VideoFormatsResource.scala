package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.QuotaUserUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFormatsResource extends StObject {
  
  /** Gets one video format by ID. */
  def get(): Request[VideoFormat] = js.native
  def get(request: QuotaUserUploadType): Request[VideoFormat] = js.native
  
  /** Lists available video formats. */
  def list(): Request[VideoFormatsListResponse] = js.native
  def list(request: Callback): Request[VideoFormatsListResponse] = js.native
}
