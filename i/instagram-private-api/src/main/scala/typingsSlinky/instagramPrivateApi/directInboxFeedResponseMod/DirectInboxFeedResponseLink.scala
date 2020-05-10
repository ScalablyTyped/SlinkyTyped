package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectInboxFeedResponseLink extends js.Object {
  var client_context: String = js.native
  var link_context: DirectInboxFeedResponseLinkContext = js.native
  var mutation_token: String = js.native
  var text: String = js.native
}

object DirectInboxFeedResponseLink {
  @scala.inline
  def apply(
    client_context: String,
    link_context: DirectInboxFeedResponseLinkContext,
    mutation_token: String,
    text: String
  ): DirectInboxFeedResponseLink = {
    val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], link_context = link_context.asInstanceOf[js.Any], mutation_token = mutation_token.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseLink]
  }
  @scala.inline
  implicit class DirectInboxFeedResponseLinkOps[Self <: DirectInboxFeedResponseLink] (val x: Self) extends AnyVal {
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
    def withLink_context(value: DirectInboxFeedResponseLinkContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutation_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

