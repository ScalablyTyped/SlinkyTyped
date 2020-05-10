package typingsSlinky.antDesignPro.headerDropdownMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.antDesignProStrings.bottomCenter
import typingsSlinky.antDesignPro.antDesignProStrings.bottomLeft
import typingsSlinky.antDesignPro.antDesignProStrings.bottomRight
import typingsSlinky.antDesignPro.antDesignProStrings.topCenter
import typingsSlinky.antDesignPro.antDesignProStrings.topLeft
import typingsSlinky.antDesignPro.antDesignProStrings.topRight
import typingsSlinky.antd.dropdownDropdownMod.DropDownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderDropdownProps extends DropDownProps {
  @JSName("overlay")
  var overlay_HeaderDropdownProps: TagMod[Any] | OverlayFunc = js.native
  @JSName("placement")
  var placement_HeaderDropdownProps: js.UndefOr[bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter] = js.native
}

object HeaderDropdownProps {
  @scala.inline
  def apply(): HeaderDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderDropdownProps]
  }
  @scala.inline
  implicit class HeaderDropdownPropsOps[Self <: HeaderDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverlayReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayFunction0(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverlay(value: TagMod[Any] | OverlayFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
  }
  
}

