package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchRequest extends js.Object {
  var labelFilterAction: js.UndefOr[String] = js.native
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  var topicName: js.UndefOr[String] = js.native
}

object WatchRequest {
  @scala.inline
  def apply(): WatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchRequest]
  }
  @scala.inline
  implicit class WatchRequestOps[Self <: WatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelFilterAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFilterAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFilterAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFilterAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(js.undefined)
        ret
    }
  }
  
}

