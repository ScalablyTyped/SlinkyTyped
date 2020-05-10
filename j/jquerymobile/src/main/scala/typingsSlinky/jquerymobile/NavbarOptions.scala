package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarOptions extends js.Object {
  var iconpos: String = js.native
}

object NavbarOptions {
  @scala.inline
  def apply(iconpos: String): NavbarOptions = {
    val __obj = js.Dynamic.literal(iconpos = iconpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarOptions]
  }
  @scala.inline
  implicit class NavbarOptionsOps[Self <: NavbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconpos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconpos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

