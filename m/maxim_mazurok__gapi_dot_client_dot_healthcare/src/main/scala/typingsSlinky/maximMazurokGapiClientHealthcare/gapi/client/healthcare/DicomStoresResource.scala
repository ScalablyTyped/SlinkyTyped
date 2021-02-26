package typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Alt
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Callback
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.DicomStoreId
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Fields
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Filter
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Key
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Name
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.OptionsrequestedPolicyVersion
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Resource
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DicomStoresResource extends StObject {
  
  /** Creates a new DICOM store within the parent dataset. */
  def create(request: Callback): Request[DicomStore] = js.native
  def create(request: DicomStoreId, body: DicomStore): Request[DicomStore] = js.native
  
  /**
    * De-identifies data from the source store and writes it to the destination store. The metadata field type is OperationMetadata. If the request is successful, the response field type
    * is DeidentifyDicomStoreSummary. If errors occur, error is set. The LRO result may still be successful if de-identification fails for some DICOM instances. The output DICOM store
    * will not contain these failed resources. Failed resource totals are tracked in Operation.metadata. Error details are also logged to Cloud Logging (see [Viewing
    * logs](/healthcare/docs/how-tos/logging)).
    */
  def deidentify(request: Fields): Request[Operation] = js.native
  def deidentify(request: Key, body: DeidentifyDicomStoreRequest): Request[Operation] = js.native
  
  /** Deletes the specified DICOM store and removes all images that are contained within it. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  def export(request: Name, body: ExportDicomDataRequest): Request[Operation] = js.native
  /**
    * Exports data to the specified destination by copying it from the DICOM store. Errors are also logged to Cloud Logging. For more information, see [Viewing
    * logs](/healthcare/docs/how-tos/logging). The metadata field type is OperationMetadata.
    */
  def export(request: Oauthtoken): Request[Operation] = js.native
  
  /** Gets the specified DICOM store. */
  def get(): Request[DicomStore] = js.native
  def get(request: Name): Request[DicomStore] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  def `import`(request: Name, body: ImportDicomDataRequest): Request[Operation] = js.native
  /**
    * Imports data into the DICOM store by copying it from the specified source. Errors are logged to Cloud Logging. For more information, see [Viewing
    * logs](/healthcare/docs/how-tos/logging). The metadata field type is OperationMetadata.
    */
  def `import`(request: PrettyPrint): Request[Operation] = js.native
  
  /** Lists the DICOM stores in the given dataset. */
  def list(): Request[ListDicomStoresResponse] = js.native
  def list(request: Filter): Request[ListDicomStoresResponse] = js.native
  
  /** Updates the specified DICOM store. */
  def patch(request: QuotaUser): Request[DicomStore] = js.native
  def patch(request: UpdateMask, body: DicomStore): Request[DicomStore] = js.native
  
  /**
    * SearchForInstances returns a list of matching instances. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the
    * implementation of SearchForInstances, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement.
    * For samples that show how to call SearchForInstances, see [Searching for studies, series, instances, and
    * frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
    */
  def searchForInstances(): Request[HttpBody] = js.native
  def searchForInstances(request: Accesstoken): Request[HttpBody] = js.native
  
  /**
    * SearchForSeries returns a list of matching series. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the
    * implementation of SearchForSeries, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For
    * samples that show how to call SearchForSeries, see [Searching for studies, series, instances, and
    * frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
    */
  def searchForSeries(): Request[HttpBody] = js.native
  def searchForSeries(request: Accesstoken): Request[HttpBody] = js.native
  
  /**
    * SearchForStudies returns a list of matching studies. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the
    * implementation of SearchForStudies, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement.
    * For samples that show how to call SearchForStudies, see [Searching for studies, series, instances, and
    * frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
    */
  def searchForStudies(): Request[HttpBody] = js.native
  def searchForStudies(request: Accesstoken): Request[HttpBody] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  def storeInstances(request: Accesstoken, body: HttpBody): Request[HttpBody] = js.native
  /**
    * StoreInstances stores DICOM instances associated with study instance unique identifiers (SUID). See [Store Transaction]
    * (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.5). For details on the implementation of StoreInstances, see [Store
    * transaction](https://cloud.google.com/healthcare/docs/dicom#store_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call StoreInstances,
    * see [Storing DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#storing_dicom_data).
    */
  def storeInstances(request: Alt): Request[HttpBody] = js.native
  
  var studies: StudiesResource = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
