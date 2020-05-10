package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentDiscussionnumber extends js.Object {
  var content: AnonEnumRequired = js.native
  var discussion_number: AnonRequired = js.native
  var org: AnonRequired = js.native
  var team_slug: AnonRequired = js.native
}

object AnonContentDiscussionnumber {
  @scala.inline
  def apply(
    content: AnonEnumRequired,
    discussion_number: AnonRequired,
    org: AnonRequired,
    team_slug: AnonRequired
  ): AnonContentDiscussionnumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentDiscussionnumber]
  }
  @scala.inline
  implicit class AnonContentDiscussionnumberOps[Self <: AnonContentDiscussionnumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: AnonEnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscussion_number(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discussion_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_slug(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_slug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

