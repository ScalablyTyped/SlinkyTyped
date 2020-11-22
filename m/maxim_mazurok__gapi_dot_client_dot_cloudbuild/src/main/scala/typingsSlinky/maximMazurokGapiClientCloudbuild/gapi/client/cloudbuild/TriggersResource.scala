package typingsSlinky.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudbuild.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientCloudbuild.anon.PageToken
import typingsSlinky.maximMazurokGapiClientCloudbuild.anon.TriggerId
import typingsSlinky.maximMazurokGapiClientCloudbuild.anon.UploadType
import typingsSlinky.maximMazurokGapiClientCloudbuild.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientCloudbuild.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggersResource extends js.Object {
  
  /** Creates a new `BuildTrigger`. This API is experimental. */
  def create(request: UploadType): Request[BuildTrigger] = js.native
  def create(request: Uploadprotocol, body: BuildTrigger): Request[BuildTrigger] = js.native
  
  /** Deletes a `BuildTrigger` by its project ID and trigger ID. This API is experimental. */
  def delete(): Request[js.Object] = js.native
  def delete(request: TriggerId): Request[js.Object] = js.native
  
  /** Returns information about a `BuildTrigger`. This API is experimental. */
  def get(): Request[BuildTrigger] = js.native
  def get(request: TriggerId): Request[BuildTrigger] = js.native
  
  /** Lists existing `BuildTrigger`s. This API is experimental. */
  def list(): Request[ListBuildTriggersResponse] = js.native
  def list(request: PageToken): Request[ListBuildTriggersResponse] = js.native
  
  def patch(request: TriggerId, body: BuildTrigger): Request[BuildTrigger] = js.native
  /** Updates a `BuildTrigger` by its project ID and trigger ID. This API is experimental. */
  def patch(request: Xgafv): Request[BuildTrigger] = js.native
  
  /** Runs a `BuildTrigger` at a particular source revision. */
  def run(request: AccesstokenAlt): Request[Operation] = js.native
  def run(request: TriggerId, body: RepoSource): Request[Operation] = js.native
}
