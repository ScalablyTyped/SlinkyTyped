package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gap extends js.Object {
  var border: js.UndefOr[ColorWidth] = js.native
  var check: js.UndefOr[RadiusString] = js.native
  var gap: js.UndefOr[String] = js.native
  var hover: js.UndefOr[Border0] = js.native
  var icon: js.UndefOr[ExtendExtendType] = js.native
  var icons: js.UndefOr[Circle] = js.native
  var size: js.UndefOr[String] = js.native
}

object Gap {
  @scala.inline
  def apply(): Gap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gap]
  }
  @scala.inline
  implicit class GapOps[Self <: Gap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: ColorWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withCheck(value: RadiusString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withGap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: Border0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: ExtendExtendType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: Circle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

