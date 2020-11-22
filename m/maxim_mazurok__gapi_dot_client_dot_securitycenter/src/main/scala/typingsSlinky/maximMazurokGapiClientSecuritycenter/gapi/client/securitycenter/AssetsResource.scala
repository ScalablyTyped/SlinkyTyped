package typingsSlinky.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Alt
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Callback
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Fields
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Key
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetsResource extends js.Object {
  
  /** Filters an organization's assets and groups them by their specified properties. */
  def group(request: Accesstoken): Request[GroupAssetsResponse] = js.native
  def group(request: Alt, body: GroupAssetsRequest): Request[GroupAssetsResponse] = js.native
  
  /** Lists an organization's assets. */
  def list(): Request[ListAssetsResponse] = js.native
  def list(request: Callback): Request[ListAssetsResponse] = js.native
  
  def runDiscovery(request: Alt, body: RunAssetDiscoveryRequest): Request[Operation] = js.native
  /**
    * Runs asset discovery. The discovery is tracked with a long-running operation. This API can only be called with limited frequency for an organization. If it is called too frequently
    * the caller will receive a TOO_MANY_REQUESTS error.
    */
  def runDiscovery(request: Fields): Request[Operation] = js.native
  
  /** Updates security marks. */
  def updateSecurityMarks(request: Key): Request[SecurityMarks] = js.native
  def updateSecurityMarks(request: Name, body: SecurityMarks): Request[SecurityMarks] = js.native
}
