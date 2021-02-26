package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContaineranalysis.anon.Key
import typingsSlinky.maximMazurokGapiClientContaineranalysis.anon.PageSize
import typingsSlinky.maximMazurokGapiClientContaineranalysis.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanConfigsResource extends StObject {
  
  /** Gets the specified scan configuration. */
  def get(): Request[ScanConfig] = js.native
  def get(request: Key): Request[ScanConfig] = js.native
  
  /** Lists scan configurations for the specified project. */
  def list(): Request[ListScanConfigsResponse] = js.native
  def list(request: PageSize): Request[ListScanConfigsResponse] = js.native
  
  def update(request: Key, body: ScanConfig): Request[ScanConfig] = js.native
  /** Updates the specified scan configuration. */
  def update(request: UploadType): Request[ScanConfig] = js.native
}
