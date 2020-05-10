package typingsSlinky.reactOnclickoutside.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalProps extends ConfigObject {
  var disableOnClickOutside: js.UndefOr[Boolean] = js.native
  var eventTypes: js.UndefOr[String | js.Array[String]] = js.native
  var outsideClickIgnoreClass: js.UndefOr[String] = js.native
  var preventDefault: js.UndefOr[Boolean] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
}

object AdditionalProps {
  @scala.inline
  def apply(): AdditionalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalProps]
  }
  @scala.inline
  implicit class AdditionalPropsOps[Self <: AdditionalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableOnClickOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOnClickOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOnClickOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOnClickOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTypes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withOutsideClickIgnoreClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideClickIgnoreClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutsideClickIgnoreClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideClickIgnoreClass")(js.undefined)
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
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
  }
  
}

