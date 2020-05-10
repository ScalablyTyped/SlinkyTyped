package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetBranchResponse extends js.Object {
  var _links: ReposGetBranchResponseLinks = js.native
  var commit: ReposGetBranchResponseCommit = js.native
  var name: String = js.native
  var `protected`: Boolean = js.native
  var protection: ReposGetBranchResponseProtection = js.native
  var protection_url: String = js.native
}

object ReposGetBranchResponse {
  @scala.inline
  def apply(
    _links: ReposGetBranchResponseLinks,
    commit: ReposGetBranchResponseCommit,
    name: String,
    `protected`: Boolean,
    protection: ReposGetBranchResponseProtection,
    protection_url: String
  ): ReposGetBranchResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponse]
  }
  @scala.inline
  implicit class ReposGetBranchResponseOps[Self <: ReposGetBranchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: ReposGetBranchResponseLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: ReposGetBranchResponseCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtection(value: ReposGetBranchResponseProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtection_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

