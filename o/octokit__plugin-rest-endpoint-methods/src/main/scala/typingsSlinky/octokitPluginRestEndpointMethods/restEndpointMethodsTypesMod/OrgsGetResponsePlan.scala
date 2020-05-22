package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetResponsePlan extends js.Object {
  var filled_seats: js.UndefOr[Double] = js.undefined
  var name: String
  var private_repos: Double
  var seats: js.UndefOr[Double] = js.undefined
  var space: Double
}

object OrgsGetResponsePlan {
  @scala.inline
  def apply(
    name: String,
    private_repos: Double,
    space: Double,
    filled_seats: js.UndefOr[Double] = js.undefined,
    seats: js.UndefOr[Double] = js.undefined
  ): OrgsGetResponsePlan = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    if (!js.isUndefined(filled_seats)) __obj.updateDynamic("filled_seats")(filled_seats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seats)) __obj.updateDynamic("seats")(seats.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetResponsePlan]
  }
}

