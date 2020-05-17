package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Affiliation extends js.Object {
  var affiliation: Enum = js.native
  var page: Type = js.native
  var per_page: Type = js.native
  var project_id: Required = js.native
}

object Affiliation {
  @scala.inline
  def apply(affiliation: Enum, page: Type, per_page: Type, project_id: Required): Affiliation = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affiliation]
  }
  @scala.inline
  implicit class AffiliationOps[Self <: Affiliation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffiliation(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affiliation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

