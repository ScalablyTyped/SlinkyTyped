package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsCreateDiscussionInOrgResponseReactions extends js.Object {
  var `-1`: Double = js.native
  @JSName("+1")
  var Plussign1: Double = js.native
  var confused: Double = js.native
  var heart: Double = js.native
  var hooray: Double = js.native
  var laugh: Double = js.native
  var total_count: Double = js.native
  var url: String = js.native
}

object TeamsCreateDiscussionInOrgResponseReactions {
  @scala.inline
  def apply(
    `-1`: Double,
    Plussign1: Double,
    confused: Double,
    heart: Double,
    hooray: Double,
    laugh: Double,
    total_count: Double,
    url: String
  ): TeamsCreateDiscussionInOrgResponseReactions = {
    val __obj = js.Dynamic.literal(confused = confused.asInstanceOf[js.Any], heart = heart.asInstanceOf[js.Any], hooray = hooray.asInstanceOf[js.Any], laugh = laugh.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("-1")(`-1`.asInstanceOf[js.Any])
    __obj.updateDynamic("+1")(Plussign1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionInOrgResponseReactions]
  }
  @scala.inline
  implicit class TeamsCreateDiscussionInOrgResponseReactionsOps[Self <: TeamsCreateDiscussionInOrgResponseReactions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with-1`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlussign1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("+1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfused(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHooray(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaugh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laugh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

