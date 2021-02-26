package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataproc.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientDataproc.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientDataproc.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientDataproc.anon.Fields
import typingsSlinky.maximMazurokGapiClientDataproc.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientDataproc.anon.JobId
import typingsSlinky.maximMazurokGapiClientDataproc.anon.JobStateMatcher
import typingsSlinky.maximMazurokGapiClientDataproc.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends StObject {
  
  /**
    * Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list
    * (https://cloud.google.com/dataproc/docs/reference/rest/v1/projects.regions.jobs/list) or regions/{region}/jobs.get
    * (https://cloud.google.com/dataproc/docs/reference/rest/v1/projects.regions.jobs/get).
    */
  def cancel(request: JobId): Request[Job] = js.native
  def cancel(request: Xgafv, body: CancelJobRequest): Request[Job] = js.native
  
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Xgafv): Request[js.Object] = js.native
  
  /** Gets the resource representation for a job in a project. */
  def get(): Request[Job] = js.native
  def get(request: Xgafv): Request[Job] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: Fields, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists regions/{region}/jobs in a project. */
  def list(): Request[ListJobsResponse] = js.native
  def list(request: JobStateMatcher): Request[ListJobsResponse] = js.native
  
  /** Updates a job in a project. */
  def patch(request: AccesstokenAlt): Request[Job] = js.native
  def patch(request: AltCallback, body: Job): Request[Job] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors. */
  def setIamPolicy(request: Fields, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Submits a job to a cluster. */
  def submit(request: CallbackFields): Request[Job] = js.native
  def submit(request: FieldsKey, body: SubmitJobRequest): Request[Job] = js.native
  
  /** Submits job to a cluster. */
  def submitAsOperation(request: CallbackFields): Request[Operation] = js.native
  def submitAsOperation(request: FieldsKey, body: SubmitJobRequest): Request[Operation] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Fields, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
