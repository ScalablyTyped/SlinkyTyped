package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Private extends js.Object {
  var description: Type = js.native
  var name: Required = js.native
  var owner: Type = js.native
  var `private`: Type = js.native
  var template_owner: Required = js.native
  var template_repo: Required = js.native
}

object Private {
  @scala.inline
  def apply(
    description: Type,
    name: Required,
    owner: Type,
    `private`: Type,
    template_owner: Required,
    template_repo: Required
  ): Private = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Private]
  }
  @scala.inline
  implicit class PrivateOps[Self <: Private] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_owner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_repo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_repo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

