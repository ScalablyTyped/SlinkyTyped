package typingsSlinky.instagramPrivateApi.storiesTypesMod

import typingsSlinky.instagramPrivateApi.AnonPkNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryServiceSeenInputItems extends js.Object {
  var id: String = js.native
  var taken_at: Double = js.native
  var user: AnonPkNumber = js.native
}

object StoryServiceSeenInputItems {
  @scala.inline
  def apply(id: String, taken_at: Double, user: AnonPkNumber): StoryServiceSeenInputItems = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryServiceSeenInputItems]
  }
  @scala.inline
  implicit class StoryServiceSeenInputItemsOps[Self <: StoryServiceSeenInputItems] (val x: Self) extends AnyVal {
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
    def withTaken_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taken_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: AnonPkNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

