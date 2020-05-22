package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.Custom
import typingsSlinky.pubnub.anon.CustomFields
import typingsSlinky.pubnub.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipsInputParameters extends GetObjectsParameters {
  var spaces: js.Array[Custom]
  var userId: String
}

object MembershipsInputParameters {
  @scala.inline
  def apply(
    spaces: js.Array[Custom],
    userId: String,
    include: CustomFields = null,
    limit: js.UndefOr[Double] = js.undefined,
    page: Next = null
  ): MembershipsInputParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipsInputParameters]
  }
}

