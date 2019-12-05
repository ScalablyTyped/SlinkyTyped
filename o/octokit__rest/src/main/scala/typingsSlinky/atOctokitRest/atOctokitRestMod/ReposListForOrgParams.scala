package typingsSlinky.atOctokitRest.atOctokitRestMod

import typingsSlinky.atOctokitRest.atOctokitRestStrings.`private`
import typingsSlinky.atOctokitRest.atOctokitRestStrings.all
import typingsSlinky.atOctokitRest.atOctokitRestStrings.asc
import typingsSlinky.atOctokitRest.atOctokitRestStrings.created
import typingsSlinky.atOctokitRest.atOctokitRestStrings.desc
import typingsSlinky.atOctokitRest.atOctokitRestStrings.forks
import typingsSlinky.atOctokitRest.atOctokitRestStrings.full_name
import typingsSlinky.atOctokitRest.atOctokitRestStrings.member
import typingsSlinky.atOctokitRest.atOctokitRestStrings.public
import typingsSlinky.atOctokitRest.atOctokitRestStrings.pushed
import typingsSlinky.atOctokitRest.atOctokitRestStrings.sources
import typingsSlinky.atOctokitRest.atOctokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForOrgParams extends js.Object {
  /**
    * Can be one of `asc` or `desc`. Default: when using `full_name`: `asc`, otherwise `desc`
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  var org: String
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
    * Can be one of `all`, `public`, `private`, `forks`, `sources`, `member`.
    */
  var `type`: js.UndefOr[all | public | `private` | forks | sources | member] = js.undefined
}

object ReposListForOrgParams {
  @scala.inline
  def apply(
    org: String,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: created | updated | pushed | full_name = null,
    `type`: all | public | `private` | forks | sources | member = null
  ): ReposListForOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForOrgParams]
  }
}

