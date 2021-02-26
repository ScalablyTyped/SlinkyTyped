package typingsSlinky.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Callback
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.PageSize
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Parent
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Resource
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.UploadType
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PretargetingConfigsResource extends StObject {
  
  /** Activates a pretargeting configuration. */
  def activate(request: PrettyPrint): Request[PretargetingConfig] = js.native
  def activate(request: QuotaUser, body: ActivatePretargetingConfigRequest): Request[PretargetingConfig] = js.native
  
  /** Adds targeted apps to the pretargeting configuration. */
  def addTargetedApps(request: typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.PretargetingConfig): Request[PretargetingConfig] = js.native
  def addTargetedApps(request: UploadType, body: AddTargetedAppsRequest): Request[PretargetingConfig] = js.native
  
  /** Adds targeted publishers to the pretargeting config. */
  def addTargetedPublishers(request: Resource): Request[PretargetingConfig] = js.native
  def addTargetedPublishers(request: UploadType, body: AddTargetedPublishersRequest): Request[PretargetingConfig] = js.native
  
  def addTargetedSites(request: UploadType, body: AddTargetedSitesRequest): Request[PretargetingConfig] = js.native
  /** Adds targeted sites to the pretargeting configuration. */
  def addTargetedSites(request: Uploadprotocol): Request[PretargetingConfig] = js.native
  
  def create(request: Callback, body: PretargetingConfig): Request[PretargetingConfig] = js.native
  /**
    * Creates a pretargeting configuration. A pretargeting configuration's state (PretargetingConfig.state) is active upon creation, and it will start to affect traffic shortly after. A
    * bidder may create a maximum of 10 pretargeting configurations. Attempts to exceed this maximum results in a 400 bad request error.
    */
  def create(request: Parent): Request[PretargetingConfig] = js.native
  
  /** Deletes a pretargeting configuration. */
  def delete(): Request[js.Object] = js.native
  def delete(request: QuotaUser): Request[js.Object] = js.native
  
  /** Gets a pretargeting configuration. */
  def get(): Request[PretargetingConfig] = js.native
  def get(request: QuotaUser): Request[PretargetingConfig] = js.native
  
  /** Lists all pretargeting configurations for a single bidder. */
  def list(): Request[ListPretargetingConfigsResponse] = js.native
  def list(request: PageSize): Request[ListPretargetingConfigsResponse] = js.native
  
  def patch(request: Oauthtoken, body: PretargetingConfig): Request[PretargetingConfig] = js.native
  /** Updates a pretargeting configuration. */
  def patch(request: UpdateMask): Request[PretargetingConfig] = js.native
  
  def removeTargetedApps(request: UploadType, body: RemoveTargetedAppsRequest): Request[PretargetingConfig] = js.native
  /** Removes targeted apps from the pretargeting configuration. */
  def removeTargetedApps(request: Xgafv): Request[PretargetingConfig] = js.native
  
  /** Removes targeted publishers from the pretargeting config. */
  def removeTargetedPublishers(request: AccesstokenAlt): Request[PretargetingConfig] = js.native
  def removeTargetedPublishers(request: UploadType, body: RemoveTargetedPublishersRequest): Request[PretargetingConfig] = js.native
  
  /** Removes targeted sites from the pretargeting configuration. */
  def removeTargetedSites(request: AltCallback): Request[PretargetingConfig] = js.native
  def removeTargetedSites(request: UploadType, body: RemoveTargetedSitesRequest): Request[PretargetingConfig] = js.native
  
  /** Suspends a pretargeting configuration. */
  def suspend(request: CallbackFields): Request[PretargetingConfig] = js.native
  def suspend(request: QuotaUser, body: SuspendPretargetingConfigRequest): Request[PretargetingConfig] = js.native
}
