package typingsSlinky.maximMazurokGapiClientMl.gapi.client.ml

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMl.anon.Alt
import typingsSlinky.maximMazurokGapiClientMl.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientMl.anon.Fields
import typingsSlinky.maximMazurokGapiClientMl.anon.StudyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StudiesResource extends js.Object {
  
  def create(request: AltCallback, body: GoogleCloudMlV1Study): Request[GoogleCloudMlV1Study] = js.native
  /** Creates a study. */
  def create(request: StudyId): Request[GoogleCloudMlV1Study] = js.native
  
  /** Deletes a study. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a study. */
  def get(): Request[GoogleCloudMlV1Study] = js.native
  def get(request: Alt): Request[GoogleCloudMlV1Study] = js.native
  
  /** Lists all the studies in a region for an associated project. */
  def list(): Request[GoogleCloudMlV1ListStudiesResponse] = js.native
  def list(request: Fields): Request[GoogleCloudMlV1ListStudiesResponse] = js.native
  
  var trials: TrialsResource = js.native
}
