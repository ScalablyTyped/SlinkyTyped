package typingsSlinky.asana.mod.resources.Projects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FollowersParams extends js.Object {
  var followers: js.Array[Double | String] = js.native
}

object FollowersParams {
  @scala.inline
  def apply(followers: js.Array[Double | String]): FollowersParams = {
    val __obj = js.Dynamic.literal(followers = followers.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowersParams]
  }
  @scala.inline
  implicit class FollowersParamsOps[Self <: FollowersParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowers(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

