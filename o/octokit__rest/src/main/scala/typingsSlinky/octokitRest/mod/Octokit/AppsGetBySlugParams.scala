package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsGetBySlugParams extends js.Object {
  var app_slug: String = js.native
}

object AppsGetBySlugParams {
  @scala.inline
  def apply(app_slug: String): AppsGetBySlugParams = {
    val __obj = js.Dynamic.literal(app_slug = app_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetBySlugParams]
  }
  @scala.inline
  implicit class AppsGetBySlugParamsOps[Self <: AppsGetBySlugParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_slug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_slug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

