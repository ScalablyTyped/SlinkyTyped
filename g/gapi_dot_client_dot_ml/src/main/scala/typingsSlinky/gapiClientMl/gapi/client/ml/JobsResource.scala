package typingsSlinky.gapiClientMl.gapi.client.ml

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientMl.AnonAccesstoken
import typingsSlinky.gapiClientMl.AnonAlt
import typingsSlinky.gapiClientMl.AnonBearertoken
import typingsSlinky.gapiClientMl.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  /** Cancels a running job. */
  def cancel(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Creates a training or a batch prediction job. */
  def create(request: AnonAlt): Request_[GoogleCloudMlV1Job] = js.native
  /** Describes a job. */
  def get(request: AnonAccesstoken): Request_[GoogleCloudMlV1Job] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonBearertoken): Request_[GoogleIamV1Policy] = js.native
  /** Lists the jobs in the project. */
  def list(request: AnonCallback): Request_[GoogleCloudMlV1ListJobsResponse] = js.native
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

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstoken => Request_[js.Object],
    create: AnonAlt => Request_[GoogleCloudMlV1Job],
    get: AnonAccesstoken => Request_[GoogleCloudMlV1Job],
    getIamPolicy: AnonBearertoken => Request_[GoogleIamV1Policy],
    list: AnonCallback => Request_[GoogleCloudMlV1ListJobsResponse],
    setIamPolicy: AnonBearertoken => Request_[GoogleIamV1Policy],
    testIamPermissions: AnonBearertoken => Request_[GoogleIamV1TestIamPermissionsResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[JobsResource]
  }
  @scala.inline
  implicit class JobsResourceOps[Self <: JobsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: AnonAlt => Request_[GoogleCloudMlV1Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[GoogleCloudMlV1Job]): Self = {
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
    def withList(value: AnonCallback => Request_[GoogleCloudMlV1ListJobsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
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
  }
  
}

