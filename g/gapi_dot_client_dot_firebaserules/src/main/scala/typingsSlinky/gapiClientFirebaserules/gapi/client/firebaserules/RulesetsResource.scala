package typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFirebaserules.AnonAccesstoken
import typingsSlinky.gapiClientFirebaserules.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesetsResource extends js.Object {
  /**
    * Create a `Ruleset` from `Source`.
    *
    * The `Ruleset` is given a unique generated name which is returned to the
    * caller. `Source` containing syntactic or semantics errors will result in an
    * error response indicating the first error encountered. For a detailed view
    * of `Source` issues, use TestRuleset.
    */
  def create(request: AnonAccesstoken): Request_[Ruleset] = js.native
  /**
    * Delete a `Ruleset` by resource name.
    *
    * If the `Ruleset` is referenced by a `Release` the operation will fail.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Get a `Ruleset` by name including the full `Source` contents. */
  def get(request: AnonAccesstoken): Request_[Ruleset] = js.native
  /**
    * List `Ruleset` metadata only and optionally filter the results by `Ruleset`
    * name.
    *
    * The full `Source` contents of a `Ruleset` may be retrieved with
    * GetRuleset.
    */
  def list(request: AnonBearertoken): Request_[ListRulesetsResponse] = js.native
}

object RulesetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Ruleset],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[Ruleset],
    list: AnonBearertoken => Request_[ListRulesetsResponse]
  ): RulesetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RulesetsResource]
  }
  @scala.inline
  implicit class RulesetsResourceOps[Self <: RulesetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[Ruleset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[Ruleset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListRulesetsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

