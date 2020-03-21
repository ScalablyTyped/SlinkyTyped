package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPerpagePullnumber extends js.Object {
  var number: AnonAlias
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var pull_number: AnonRequired
  var repo: AnonRequired
  var review_id: AnonRequired
}

object AnonPerpagePullnumber {
  @scala.inline
  def apply(
    number: AnonAlias,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    pull_number: AnonRequired,
    repo: AnonRequired,
    review_id: AnonRequired
  ): AnonPerpagePullnumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPerpagePullnumber]
  }
}

