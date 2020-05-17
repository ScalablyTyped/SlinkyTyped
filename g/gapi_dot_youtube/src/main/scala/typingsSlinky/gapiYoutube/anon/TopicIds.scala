package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicIds extends js.Object {
  /**
    * A list of Freebase topic IDs associated with the video. You can retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.Array[String] = js.native
}

object TopicIds {
  @scala.inline
  def apply(topicIds: js.Array[String]): TopicIds = {
    val __obj = js.Dynamic.literal(topicIds = topicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicIds]
  }
  @scala.inline
  implicit class TopicIdsOps[Self <: TopicIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopicIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

