package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionCommentInOrgParams extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: String
  var comment_number: Double
  var discussion_number: Double
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsUpdateDiscussionCommentInOrgParams {
  @scala.inline
  def apply(body: String, comment_number: Double, discussion_number: Double, org_ : String, team_slug: String): TeamsUpdateDiscussionCommentInOrgParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionCommentInOrgParams]
  }
}

