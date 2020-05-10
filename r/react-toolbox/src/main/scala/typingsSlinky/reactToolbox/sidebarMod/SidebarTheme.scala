package typingsSlinky.reactToolbox.sidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarTheme extends js.Object {
  /**
    * Added to the root class when it is clipped.
    */
  var clipped: js.UndefOr[String] = js.native
  /**
    * Added to the root class if sidebar is pinned.
    */
  var pinned: js.UndefOr[String] = js.native
}

object SidebarTheme {
  @scala.inline
  def apply(): SidebarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidebarTheme]
  }
  @scala.inline
  implicit class SidebarThemeOps[Self <: SidebarTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
  }
  
}

