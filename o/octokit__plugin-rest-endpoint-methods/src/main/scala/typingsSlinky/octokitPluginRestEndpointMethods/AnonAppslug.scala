package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppslug extends js.Object {
  var app_slug: AnonRequired = js.native
}

object AnonAppslug {
  @scala.inline
  def apply(app_slug: AnonRequired): AnonAppslug = {
    val __obj = js.Dynamic.literal(app_slug = app_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppslug]
  }
  @scala.inline
  implicit class AnonAppslugOps[Self <: AnonAppslug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_slug(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_slug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

