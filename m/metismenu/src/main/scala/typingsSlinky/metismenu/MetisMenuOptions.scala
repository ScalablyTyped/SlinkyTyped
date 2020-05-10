package typingsSlinky.metismenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetisMenuOptions extends js.Object {
  var parentTrigger: js.UndefOr[String] = js.native
  var preventDefault: js.UndefOr[Boolean] = js.native
  var subMenu: js.UndefOr[String] = js.native
  var toggle: js.UndefOr[Boolean] = js.native
  var triggerElement: js.UndefOr[String] = js.native
}

object MetisMenuOptions {
  @scala.inline
  def apply(): MetisMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetisMenuOptions]
  }
  @scala.inline
  implicit class MetisMenuOptionsOps[Self <: MetisMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerElement")(js.undefined)
        ret
    }
  }
  
}

