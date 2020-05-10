package typingsSlinky.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverFeedResponseNewSuggestedUsers extends js.Object {
  var suggestions: js.Array[_] = js.native
}

object DiscoverFeedResponseNewSuggestedUsers {
  @scala.inline
  def apply(suggestions: js.Array[_]): DiscoverFeedResponseNewSuggestedUsers = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverFeedResponseNewSuggestedUsers]
  }
  @scala.inline
  implicit class DiscoverFeedResponseNewSuggestedUsersOps[Self <: DiscoverFeedResponseNewSuggestedUsers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

