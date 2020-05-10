package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTopicIds extends js.Object {
  /**
    * A list of Freebase topic IDs associated with the video. You can retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.Array[String] = js.native
}

object AnonTopicIds {
  @scala.inline
  def apply(topicIds: js.Array[String]): AnonTopicIds = {
    val __obj = js.Dynamic.literal(topicIds = topicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTopicIds]
  }
  @scala.inline
  implicit class AnonTopicIdsOps[Self <: AnonTopicIds] (val x: Self) extends AnyVal {
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

