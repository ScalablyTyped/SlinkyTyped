package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateUsingTemplateParams extends js.Object {
  /**
    * A short description of the new repository.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the new repository.
    */
  var name: String = js.native
  /**
    * The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization.
    */
  var owner: js.UndefOr[String] = js.native
  /**
    * Either `true` to create a new private repository or `false` to create a new public one.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  var template_owner: String = js.native
  var template_repo: String = js.native
}

object ReposCreateUsingTemplateParams {
  @scala.inline
  def apply(name: String, template_owner: String, template_repo: String): ReposCreateUsingTemplateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateUsingTemplateParams]
  }
  @scala.inline
  implicit class ReposCreateUsingTemplateParamsOps[Self <: ReposCreateUsingTemplateParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_owner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_repo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
  }
  
}

