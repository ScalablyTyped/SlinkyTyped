package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDraftsResponse extends js.Object {
  var drafts: js.UndefOr[js.Array[Draft]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var resultSizeEstimate: js.UndefOr[Double] = js.native
}

object ListDraftsResponse {
  @scala.inline
  def apply(): ListDraftsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDraftsResponse]
  }
  @scala.inline
  implicit class ListDraftsResponseOps[Self <: ListDraftsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrafts(value: js.Array[Draft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drafts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrafts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drafts")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSizeEstimate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSizeEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSizeEstimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSizeEstimate")(js.undefined)
        ret
    }
  }
  
}

