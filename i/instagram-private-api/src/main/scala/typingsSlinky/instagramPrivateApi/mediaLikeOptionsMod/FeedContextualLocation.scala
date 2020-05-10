package typingsSlinky.instagramPrivateApi.mediaLikeOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedContextualLocation extends js.Object {
  var location_id: String | Double = js.native
  var module_name: feed_contextual_location = js.native
}

object FeedContextualLocation {
  @scala.inline
  def apply(location_id: String | Double, module_name: feed_contextual_location): FeedContextualLocation = {
    val __obj = js.Dynamic.literal(location_id = location_id.asInstanceOf[js.Any], module_name = module_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedContextualLocation]
  }
  @scala.inline
  implicit class FeedContextualLocationOps[Self <: FeedContextualLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation_id(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule_name(value: feed_contextual_location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

