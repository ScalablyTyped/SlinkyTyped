package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoTopicDetails extends js.Object {
  /**
    * Similar to topic_id, except that these topics are merely relevant to the video. These are topics that may be mentioned in, or appear in the video. You
    * can retrieve information about each topic using Freebase Topic API.
    */
  var relevantTopicIds: js.UndefOr[js.Array[String]] = js.native
  /** A list of Wikipedia URLs that provide a high-level description of the video's content. */
  var topicCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of Freebase topic IDs that are centrally associated with the video. These are topics that are centrally featured in the video, and it can be
    * said that the video is mainly about each of these. You can retrieve information about each topic using the Freebase Topic API.
    */
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

