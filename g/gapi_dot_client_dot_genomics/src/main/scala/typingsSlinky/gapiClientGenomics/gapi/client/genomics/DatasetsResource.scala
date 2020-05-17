package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGenomics.anon.Accesstoken
import typingsSlinky.gapiClientGenomics.anon.DatasetId
import typingsSlinky.gapiClientGenomics.anon.Fields
import typingsSlinky.gapiClientGenomics.anon.Key
import typingsSlinky.gapiClientGenomics.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsResource extends js.Object {
  /**
    * Creates a new dataset.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: Accesstoken): Request[Dataset] = js.native
  /**
    * Deletes a dataset and all of its contents (all read group sets,
    * reference sets, variant sets, call sets, annotation sets, etc.)
    * This is reversible (up to one week after the deletion) via
    * the
    * datasets.undelete
    * operation.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: DatasetId): Request[js.Object] = js.native
  /**
    * Gets a dataset by ID.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: DatasetId): Request[Dataset] = js.native
  /**
    * Gets the access control policy for the dataset. This is empty if the
    * policy or resource does not exist.
    *
    * See <a href="/iam/docs/managing-policies#getting_a_policy">Getting a
    * Policy</a> for more information.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  /**
    * Lists datasets within a project.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def list(request: Key): Request[ListDatasetsResponse] = js.native
  /**
    * Updates a dataset.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Dataset] = js.native
  /**
    * Sets the access control policy on the specified dataset. Replaces any
    * existing policy.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * See <a href="/iam/docs/managing-policies#setting_a_policy">Setting a
    * Policy</a> for more information.
    */
  def setIamPolicy(request: Fields): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * See <a href="/iam/docs/managing-policies#testing_permissions">Testing
    * Permissions</a> for more information.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def testIamPermissions(request: Fields): Request[TestIamPermissionsResponse] = js.native
  /**
    * Undeletes a dataset by restoring a dataset which was deleted via this API.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This operation is only possible for a week after the deletion occurred.
    */
  def undelete(request: DatasetId): Request[Dataset] = js.native
}

object DatasetsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Dataset],
    delete: DatasetId => Request[js.Object],
    get: DatasetId => Request[Dataset],
    getIamPolicy: Fields => Request[Policy],
    list: Key => Request[ListDatasetsResponse],
    patch: Oauthtoken => Request[Dataset],
    setIamPolicy: Fields => Request[Policy],
    testIamPermissions: Fields => Request[TestIamPermissionsResponse],
    undelete: DatasetId => Request[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), undelete = js.Any.fromFunction1(undelete))
    __obj.asInstanceOf[DatasetsResource]
  }
  @scala.inline
  implicit class DatasetsResourceOps[Self <: DatasetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Accesstoken => Request[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: DatasetId => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: DatasetId => Request[Dataset]): Self = {
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
    def withList(value: Key => Request[ListDatasetsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Oauthtoken => Request[Dataset]): Self = {
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
    def withTestIamPermissions(value: Fields => Request[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUndelete(value: DatasetId => Request[Dataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undelete")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

