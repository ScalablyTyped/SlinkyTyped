package typingsSlinky.instagramPrivateApi.locationFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationFeedResponseUsertags extends js.Object {
  var in: js.Array[LocationFeedResponseInItem] = js.native
}

object LocationFeedResponseUsertags {
  @scala.inline
  def apply(in: js.Array[LocationFeedResponseInItem]): LocationFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseUsertags]
  }
  @scala.inline
  implicit class LocationFeedResponseUsertagsOps[Self <: LocationFeedResponseUsertags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: js.Array[LocationFeedResponseInItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

