package typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientFirebaserules.anon.Accesstoken
import typingsSlinky.gapiClientFirebaserules.anon.Alt
import typingsSlinky.gapiClientFirebaserules.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleasesResource extends js.Object {
  /**
    * Create a `Release`.
    *
    * Release names should reflect the developer's deployment practices. For
    * example, the release name may include the environment name, application
    * name, application version, or any other name meaningful to the developer.
    * Once a `Release` refers to a `Ruleset`, the rules can be enforced by
    * Firebase Rules-enabled services.
    *
    * More than one `Release` may be 'live' concurrently. Consider the following
    * three `Release` names for `projects/foo` and the `Ruleset` to which they
    * refer.
    *
    * Release Name                    | Ruleset Name
    * --------------------------------|-------------
    * projects/foo/releases/prod      | projects/foo/rulesets/uuid123
    * projects/foo/releases/prod/beta | projects/foo/rulesets/uuid123
    * projects/foo/releases/prod/v23  | projects/foo/rulesets/uuid456
    *
    * The table reflects the `Ruleset` rollout in progress. The `prod` and
    * `prod/beta` releases refer to the same `Ruleset`. However, `prod/v23`
    * refers to a new `Ruleset`. The `Ruleset` reference for a `Release` may be
    * updated using the UpdateRelease method.
    */
  def create(request: Accesstoken): Request[Release] = js.native
  /** Delete a `Release` by resource name. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Get a `Release` by name. */
  def get(request: Accesstoken): Request[Release] = js.native
  /** Get the `Release` executable to use when enforcing rules. */
  def getExecutable(request: Alt): Request[GetReleaseExecutableResponse] = js.native
  /**
    * List the `Release` values for a project. This list may optionally be
    * filtered by `Release` name, `Ruleset` name, `TestSuite` name, or any
    * combination thereof.
    */
  def list(request: Bearertoken): Request[ListReleasesResponse] = js.native
  /**
    * Update a `Release`.
    *
    * Only updates to the `ruleset_name` and `test_suite_name` fields will be
    * honored. `Release` rename is not supported. To create a `Release` use the
    * CreateRelease method.
    */
  def update(request: Accesstoken): Request[Release] = js.native
}

object ReleasesResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Release],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Release],
    getExecutable: Alt => Request[GetReleaseExecutableResponse],
    list: Bearertoken => Request[ListReleasesResponse],
    update: Accesstoken => Request[Release]
  ): ReleasesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getExecutable = js.Any.fromFunction1(getExecutable), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ReleasesResource]
  }
  @scala.inline
  implicit class ReleasesResourceOps[Self <: ReleasesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Accesstoken => Request[Release]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Accesstoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Accesstoken => Request[Release]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetExecutable(value: Alt => Request[GetReleaseExecutableResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExecutable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Bearertoken => Request[ListReleasesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Accesstoken => Request[Release]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

