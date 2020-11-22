package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBigquery.anon.All
import typingsSlinky.maximMazurokGapiClientBigquery.anon.Alt
import typingsSlinky.maximMazurokGapiClientBigquery.anon.DatasetId
import typingsSlinky.maximMazurokGapiClientBigquery.anon.Fields
import typingsSlinky.maximMazurokGapiClientBigquery.anon.Key
import typingsSlinky.maximMazurokGapiClientBigquery.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetsResource extends js.Object {
  
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately
    * after deletion, you can create another dataset with the same name.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Returns the dataset specified by datasetID. */
  def get(): Request[Dataset] = js.native
  def get(request: DatasetId): Request[Dataset] = js.native
  
  /** Creates a new empty dataset. */
  def insert(request: Fields): Request[Dataset] = js.native
  def insert(request: Key, body: Dataset): Request[Dataset] = js.native
  
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(): Request[DatasetList] = js.native
  def list(request: All): Request[DatasetList] = js.native
  
  def patch(request: DatasetId, body: Dataset): Request[Dataset] = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted
    * dataset resource. This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Dataset] = js.native
  
  def update(request: DatasetId, body: Dataset): Request[Dataset] = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted
    * dataset resource.
    */
  def update(request: Oauthtoken): Request[Dataset] = js.native
}
