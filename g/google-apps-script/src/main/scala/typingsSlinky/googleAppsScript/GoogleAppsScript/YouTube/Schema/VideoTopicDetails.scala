package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoTopicDetails extends js.Object {
  var relevantTopicIds: js.UndefOr[js.Array[String]] = js.native
  var topicCategories: js.UndefOr[js.Array[String]] = js.native
  var topicIds: js.UndefOr[js.Array[String]] = js.native
}

object VideoTopicDetails {
  @scala.inline
  def apply(): VideoTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoTopicDetails]
  }
  @scala.inline
  implicit class VideoTopicDetailsOps[Self <: VideoTopicDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelevantTopicIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevantTopicIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevantTopicIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevantTopicIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicIds")(js.undefined)
        ret
    }
  }
  
}

