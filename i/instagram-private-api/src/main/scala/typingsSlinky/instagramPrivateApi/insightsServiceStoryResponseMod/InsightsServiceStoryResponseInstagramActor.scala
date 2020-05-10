package typingsSlinky.instagramPrivateApi.insightsServiceStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceStoryResponseInstagramActor extends js.Object {
  var id: String = js.native
  var instagram_actor_id: String = js.native
}

object InsightsServiceStoryResponseInstagramActor {
  @scala.inline
  def apply(id: String, instagram_actor_id: String): InsightsServiceStoryResponseInstagramActor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instagram_actor_id = instagram_actor_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceStoryResponseInstagramActor]
  }
  @scala.inline
  implicit class InsightsServiceStoryResponseInstagramActorOps[Self <: InsightsServiceStoryResponseInstagramActor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstagram_actor_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_actor_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

