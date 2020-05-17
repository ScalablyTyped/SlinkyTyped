package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDeploymentmanager.anon.Alt
import typingsSlinky.gapiClientDeploymentmanager.anon.CreatePolicy
import typingsSlinky.gapiClientDeploymentmanager.anon.DeletePolicy
import typingsSlinky.gapiClientDeploymentmanager.anon.Fields
import typingsSlinky.gapiClientDeploymentmanager.anon.Filter
import typingsSlinky.gapiClientDeploymentmanager.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentsResource extends js.Object {
  /** Cancels and removes the preview currently associated with the deployment. */
  def cancelPreview(request: Alt): Request[Operation] = js.native
  /** Deletes a deployment and all of the resources in the deployment. */
  def delete(request: DeletePolicy): Request[Operation] = js.native
  /** Gets information about a specific deployment. */
  def get(request: Alt): Request[Deployment] = js.native
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  /** Creates a deployment and all of the resources described by the deployment manifest. */
  def insert(request: Oauthtoken): Request[Operation] = js.native
  /** Lists all deployments for a given project. */
  def list(request: Filter): Request[DeploymentsListResponse] = js.native
  /** Updates a deployment and all of the resources described by the deployment manifest. This method supports patch semantics. */
  def patch(request: CreatePolicy): Request[Operation] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Fields): Request[Policy] = js.native
  /** Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started. */
  def stop(request: Alt): Request[Operation] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Fields): Request[TestPermissionsResponse] = js.native
  /** Updates a deployment and all of the resources described by the deployment manifest. */
  def update(request: CreatePolicy): Request[Operation] = js.native
}

object DeploymentsResource {
  @scala.inline
  def apply(
    cancelPreview: Alt => Request[Operation],
    delete: DeletePolicy => Request[Operation],
    get: Alt => Request[Deployment],
    getIamPolicy: Fields => Request[Policy],
    insert: Oauthtoken => Request[Operation],
    list: Filter => Request[DeploymentsListResponse],
    patch: CreatePolicy => Request[Operation],
    setIamPolicy: Fields => Request[Policy],
    stop: Alt => Request[Operation],
    testIamPermissions: Fields => Request[TestPermissionsResponse],
    update: CreatePolicy => Request[Operation]
  ): DeploymentsResource = {
    val __obj = js.Dynamic.literal(cancelPreview = js.Any.fromFunction1(cancelPreview), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), stop = js.Any.fromFunction1(stop), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DeploymentsResource]
  }
  @scala.inline
  implicit class DeploymentsResourceOps[Self <: DeploymentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelPreview(value: Alt => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: DeletePolicy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[Deployment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: Fields => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Oauthtoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[DeploymentsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: CreatePolicy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: Fields => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: Alt => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: Fields => Request[TestPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: CreatePolicy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

