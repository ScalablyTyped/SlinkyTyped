package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityCollection extends js.Object {
  // Query past activity in Google Drive.
  def query(resource: QueryDriveActivityRequest): QueryDriveActivityResponse = js.native
}

object ActivityCollection {
  @scala.inline
  def apply(query: QueryDriveActivityRequest => QueryDriveActivityResponse): ActivityCollection = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[ActivityCollection]
  }
  @scala.inline
  implicit class ActivityCollectionOps[Self <: ActivityCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: QueryDriveActivityRequest => QueryDriveActivityResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

