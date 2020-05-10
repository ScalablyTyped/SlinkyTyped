package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatModeratorSnippet extends js.Object {
  /**
    * The ID of the live chat this moderator can act on.
    */
  var liveChatId: js.UndefOr[String] = js.native
  /**
    * Details about the moderator.
    */
  var moderatorDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
}

object SchemaLiveChatModeratorSnippet {
  @scala.inline
  def apply(): SchemaLiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatModeratorSnippet]
  }
  @scala.inline
  implicit class SchemaLiveChatModeratorSnippetOps[Self <: SchemaLiveChatModeratorSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLiveChatId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveChatId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveChatId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveChatId")(js.undefined)
        ret
    }
    @scala.inline
    def withModeratorDetails(value: SchemaChannelProfileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderatorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModeratorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderatorDetails")(js.undefined)
        ret
    }
  }
  
}

