package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDeploymentmanager.AnonAlt
import typingsSlinky.gapiClientDeploymentmanager.AnonCreatePolicy
import typingsSlinky.gapiClientDeploymentmanager.AnonDeletePolicy
import typingsSlinky.gapiClientDeploymentmanager.AnonFields
import typingsSlinky.gapiClientDeploymentmanager.AnonFilter
import typingsSlinky.gapiClientDeploymentmanager.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentsResource extends js.Object {
  /** Cancels and removes the preview currently associated with the deployment. */
  def cancelPreview(request: AnonAlt): Request_[Operation] = js.native
  /** Deletes a deployment and all of the resources in the deployment. */
  def delete(request: AnonDeletePolicy): Request_[Operation] = js.native
  /** Gets information about a specific deployment. */
  def get(request: AnonAlt): Request_[Deployment] = js.native
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonFields): Request_[Policy] = js.native
  /** Creates a deployment and all of the resources described by the deployment manifest. */
  def insert(request: AnonOauthtoken): Request_[Operation] = js.native
  /** Lists all deployments for a given project. */
  def list(request: AnonFilter): Request_[DeploymentsListResponse] = js.native
  /** Updates a deployment and all of the resources described by the deployment manifest. This method supports patch semantics. */
  def patch(request: AnonCreatePolicy): Request_[Operation] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonFields): Request_[Policy] = js.native
  /** Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started. */
  def stop(request: AnonAlt): Request_[Operation] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonFields): Request_[TestPermissionsResponse] = js.native
  /** Updates a deployment and all of the resources described by the deployment manifest. */
  def update(request: AnonCreatePolicy): Request_[Operation] = js.native
}

object DeploymentsResource {
  @scala.inline
  def apply(
    cancelPreview: AnonAlt => Request_[Operation],
    delete: AnonDeletePolicy => Request_[Operation],
    get: AnonAlt => Request_[Deployment],
    getIamPolicy: AnonFields => Request_[Policy],
    insert: AnonOauthtoken => Request_[Operation],
    list: AnonFilter => Request_[DeploymentsListResponse],
    patch: AnonCreatePolicy => Request_[Operation],
    setIamPolicy: AnonFields => Request_[Policy],
    stop: AnonAlt => Request_[Operation],
    testIamPermissions: AnonFields => Request_[TestPermissionsResponse],
    update: AnonCreatePolicy => Request_[Operation]
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
    def withCancelPreview(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonDeletePolicy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[Deployment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonFields => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOauthtoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[DeploymentsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCreatePolicy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonFields => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonFields => Request_[TestPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonCreatePolicy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

