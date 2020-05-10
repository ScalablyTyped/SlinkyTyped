package typingsSlinky.grommet.dropMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.grommet.AnonHorizontal
import typingsSlinky.grommet.AnonLeft
import typingsSlinky.grommet.grommetStrings.auto
import typingsSlinky.grommet.grommetStrings.hidden
import typingsSlinky.grommet.grommetStrings.scroll
import typingsSlinky.grommet.grommetStrings.visible
import typingsSlinky.grommet.utilsMod.ElevationType
import typingsSlinky.grommet.utilsMod.KeyboardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropProps extends js.Object {
  var align: js.UndefOr[AnonLeft] = js.native
  var elevation: js.UndefOr[ElevationType] = js.native
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onEsc: js.UndefOr[KeyboardType] = js.native
  var overflow: js.UndefOr[auto | hidden | scroll | visible | AnonHorizontal | String] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var restrictFocus: js.UndefOr[Boolean] = js.native
  var stretch: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[js.Object] = js.native
}

object DropProps {
  @scala.inline
  def apply(): DropProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropProps]
  }
  @scala.inline
  implicit class DropPropsOps[Self <: DropProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: AnonLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation(value: ElevationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickOutside(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickOutside")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEsc(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: auto | hidden | scroll | visible | AnonHorizontal | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withStretch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

