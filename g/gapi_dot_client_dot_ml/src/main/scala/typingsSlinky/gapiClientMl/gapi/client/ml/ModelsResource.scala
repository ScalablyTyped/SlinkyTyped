package typingsSlinky.gapiClientMl.gapi.client.ml

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientMl.AnonAccesstoken
import typingsSlinky.gapiClientMl.AnonAlt
import typingsSlinky.gapiClientMl.AnonBearertoken
import typingsSlinky.gapiClientMl.AnonFields
import typingsSlinky.gapiClientMl.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelsResource extends js.Object {
  var versions: VersionsResource = js.native
  /**
    * Creates a model which will later contain one or more versions.
    *
    * You must add at least one version before you can request predictions from
    * the model. Add versions by calling
    * [projects.models.versions.create](/ml-engine/reference/rest/v1/projects.models.versions/create).
    */
  def create(request: AnonAlt): Request_[GoogleCloudMlV1Model] = js.native
  /**
    * Deletes a model.
    *
    * You can only delete a model if there are no versions in it. You can delete
    * versions by calling
    * [projects.models.versions.delete](/ml-engine/reference/rest/v1/projects.models.versions/delete).
    */
  def delete(request: AnonAccesstoken): Request_[GoogleLongrunningOperation] = js.native
  /**
    * Gets information about a model, including its name, the description (if
    * set), and the default version (if at least one version of the model has
    * been deployed).
    */
  def get(request: AnonAccesstoken): Request_[GoogleCloudMlV1Model] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonBearertoken): Request_[GoogleIamV1Policy] = js.native
  /**
    * Lists the models in a project.
    *
    * Each project can contain multiple models, and each model can have multiple
    * versions.
    */
  def list(request: AnonFields): Request_[GoogleCloudMlV1ListModelsResponse] = js.native
  /**
    * Updates a specific model resource.
    *
    * Currently the only supported fields to update are `description` and
    * `default_version.name`.
    */
  def patch(request: AnonKey): Request_[GoogleLongrunningOperation] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonBearertoken): Request_[GoogleIamV1Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonBearertoken): Request_[GoogleIamV1TestIamPermissionsResponse] = js.native
}

object ModelsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[GoogleCloudMlV1Model],
    delete: AnonAccesstoken => Request_[GoogleLongrunningOperation],
    get: AnonAccesstoken => Request_[GoogleCloudMlV1Model],
    getIamPolicy: AnonBearertoken => Request_[GoogleIamV1Policy],
    list: AnonFields => Request_[GoogleCloudMlV1ListModelsResponse],
    patch: AnonKey => Request_[GoogleLongrunningOperation],
    setIamPolicy: AnonBearertoken => Request_[GoogleIamV1Policy],
    testIamPermissions: AnonBearertoken => Request_[GoogleIamV1TestIamPermissionsResponse],
    versions: VersionsResource
  ): ModelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelsResource]
  }
  @scala.inline
  implicit class ModelsResourceOps[Self <: ModelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[GoogleCloudMlV1Model]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[GoogleLongrunningOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[GoogleCloudMlV1Model]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonBearertoken => Request_[GoogleIamV1Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[GoogleCloudMlV1ListModelsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonKey => Request_[GoogleLongrunningOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonBearertoken => Request_[GoogleIamV1Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonBearertoken => Request_[GoogleIamV1TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersions(value: VersionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

