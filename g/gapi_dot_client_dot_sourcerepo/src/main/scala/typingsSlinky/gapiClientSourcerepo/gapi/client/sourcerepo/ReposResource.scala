package typingsSlinky.gapiClientSourcerepo.gapi.client.sourcerepo

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSourcerepo.AnonAccesstoken
import typingsSlinky.gapiClientSourcerepo.AnonAlt
import typingsSlinky.gapiClientSourcerepo.AnonBearertoken
import typingsSlinky.gapiClientSourcerepo.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposResource extends js.Object {
  /**
    * Creates a repo in the given project with the given name.
    *
    * If the named repository already exists, `CreateRepo` returns
    * `ALREADY_EXISTS`.
    */
  def create(request: AnonAccesstoken): Request_[Repo] = js.native
  /** Deletes a repo. */
  def delete(request: AnonAlt): Request_[js.Object] = js.native
  /** Returns information about a repo. */
  def get(request: AnonAlt): Request_[Repo] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonBearertoken): Request_[Policy] = js.native
  /**
    * Returns all repos belonging to a project. The sizes of the repos are
    * not set by ListRepos.  To get the size of a repo, use GetRepo.
    */
  def list(request: AnonCallback): Request_[ListReposResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonBearertoken): Request_[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: AnonBearertoken): Request_[TestIamPermissionsResponse] = js.native
}

object ReposResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Repo],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[Repo],
    getIamPolicy: AnonBearertoken => Request_[Policy],
    list: AnonCallback => Request_[ListReposResponse],
    setIamPolicy: AnonBearertoken => Request_[Policy],
    testIamPermissions: AnonBearertoken => Request_[TestIamPermissionsResponse]
  ): ReposResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[ReposResource]
  }
  @scala.inline
  implicit class ReposResourceOps[Self <: ReposResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[Repo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[Repo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonBearertoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListReposResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonBearertoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonBearertoken => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

