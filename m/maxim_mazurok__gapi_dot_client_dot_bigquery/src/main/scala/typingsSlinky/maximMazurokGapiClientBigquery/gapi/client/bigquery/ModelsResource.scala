package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBigquery.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientBigquery.anon.ModelId
import typingsSlinky.maximMazurokGapiClientBigquery.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelsResource extends js.Object {
  
  /** Deletes the model specified by modelId from the dataset. */
  def delete(): Request[Unit] = js.native
  def delete(request: ModelId): Request[Unit] = js.native
  
  /** Gets the specified model resource by model ID. */
  def get(): Request[Model] = js.native
  def get(request: ModelId): Request[Model] = js.native
  
  /** Lists all models in the specified dataset. Requires the READER dataset role. */
  def list(): Request[ListModelsResponse] = js.native
  def list(request: MaxResults): Request[ListModelsResponse] = js.native
  
  def patch(request: ModelId, body: Model): Request[Model] = js.native
  /** Patch specific fields in the specified model. */
  def patch(request: QuotaUser): Request[Model] = js.native
}
