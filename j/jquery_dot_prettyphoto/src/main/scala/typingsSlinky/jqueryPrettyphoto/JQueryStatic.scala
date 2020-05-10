package typingsSlinky.jqueryPrettyphoto

import typingsSlinky.jqueryPrettyphoto.scaronPrettyPhoto.moduleJQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var prettyPhoto: moduleJQueryStatic = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(prettyPhoto: moduleJQueryStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(prettyPhoto = prettyPhoto.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrettyPhoto(value: moduleJQueryStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPhoto")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

