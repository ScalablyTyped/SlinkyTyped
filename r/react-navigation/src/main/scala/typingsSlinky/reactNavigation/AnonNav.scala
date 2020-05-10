package typingsSlinky.reactNavigation

import typingsSlinky.reactNavigation.mod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNav extends js.Object {
  var nav: NavigationState | Null = js.native
}

object AnonNav {
  @scala.inline
  def apply(): AnonNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNav]
  }
  @scala.inline
  implicit class AnonNavOps[Self <: AnonNav] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNav(value: NavigationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(null)
        ret
    }
  }
  
}

