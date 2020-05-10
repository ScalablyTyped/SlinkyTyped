package typingsSlinky.instagramPrivateApi.storyResponseOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryResponseOptions extends js.Object {
  var client_context: js.UndefOr[String] = js.native
  var mutation_token: js.UndefOr[String] = js.native
}

object StoryResponseOptions {
  @scala.inline
  def apply(): StoryResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryResponseOptions]
  }
  @scala.inline
  implicit class StoryResponseOptionsOps[Self <: StoryResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_context(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_context")(js.undefined)
        ret
    }
    @scala.inline
    def withMutation_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutation_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation_token")(js.undefined)
        ret
    }
  }
  
}

