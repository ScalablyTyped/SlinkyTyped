package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListBranchesResponseItem extends js.Object {
  var commit: ReposListBranchesResponseItemCommit = js.native
  var name: String = js.native
  var `protected`: Boolean = js.native
  var protection: ReposListBranchesResponseItemProtection = js.native
  var protection_url: String = js.native
}

object ReposListBranchesResponseItem {
  @scala.inline
  def apply(
    commit: ReposListBranchesResponseItemCommit,
    name: String,
    `protected`: Boolean,
    protection: ReposListBranchesResponseItemProtection,
    protection_url: String
  ): ReposListBranchesResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesResponseItem]
  }
  @scala.inline
  implicit class ReposListBranchesResponseItemOps[Self <: ReposListBranchesResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: ReposListBranchesResponseItemCommit): Self = {
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
    def withProtection(value: ReposListBranchesResponseItemProtection): Self = {
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

