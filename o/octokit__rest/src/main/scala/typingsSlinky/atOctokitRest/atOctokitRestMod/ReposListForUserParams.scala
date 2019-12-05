package typingsSlinky.atOctokitRest.atOctokitRestMod

import typingsSlinky.atOctokitRest.atOctokitRestStrings.all
import typingsSlinky.atOctokitRest.atOctokitRestStrings.asc
import typingsSlinky.atOctokitRest.atOctokitRestStrings.created
import typingsSlinky.atOctokitRest.atOctokitRestStrings.desc
import typingsSlinky.atOctokitRest.atOctokitRestStrings.full_name
import typingsSlinky.atOctokitRest.atOctokitRestStrings.member
import typingsSlinky.atOctokitRest.atOctokitRestStrings.owner
import typingsSlinky.atOctokitRest.atOctokitRestStrings.pushed
import typingsSlinky.atOctokitRest.atOctokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForUserParams extends js.Object {
  /**
    * Can be one of `asc` or `desc`. Default: `asc` when using `full_name`, otherwise `desc`
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * Can be one of `created`, `updated`, `pushed`, `full_name`.
    */
  var sort: js.UndefOr[created | updated | pushed | full_name] = js.undefined
  /**
    * Can be one of `all`, `owner`, `member`.
    */
  var `type`: js.UndefOr[all | owner | member] = js.undefined
  var username: String
}

object ReposListForUserParams {
  @scala.inline
  def apply(
    username: String,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: created | updated | pushed | full_name = null,
    `type`: all | owner | member = null
  ): ReposListForUserParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForUserParams]
  }
}

