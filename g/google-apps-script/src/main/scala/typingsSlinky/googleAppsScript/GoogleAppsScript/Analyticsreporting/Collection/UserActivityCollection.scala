package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserActivityCollection extends js.Object {
  // Returns User Activity data.
  def search(resource: SearchUserActivityRequest): SearchUserActivityResponse
}

object UserActivityCollection {
  @scala.inline
  def apply(search: SearchUserActivityRequest => SearchUserActivityResponse): UserActivityCollection = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[UserActivityCollection]
  }
}

