package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.any
import typingsSlinky.baseui.baseuiStrings.label
import typingsSlinky.baseui.baseuiStrings.start
import typingsSlinky.baseui.baseuiStrings.value
import typingsSlinky.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterOption extends js.Object {
  var filterOption: js.UndefOr[js.Function2[/* option */ Option, /* filterValue */ String, Boolean]] = js.native
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var labelKey: js.UndefOr[String] = js.native
  var matchPos: js.UndefOr[any | start] = js.native
  var matchProp: js.UndefOr[any | label | value] = js.native
  var trimFilter: js.UndefOr[Boolean] = js.native
  var valueKey: js.UndefOr[String] = js.native
}

object AnonFilterOption {
  @scala.inline
  def apply(): AnonFilterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFilterOption]
  }
  @scala.inline
  implicit class AnonFilterOptionOps[Self <: AnonFilterOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterOption(value: (/* option */ Option, /* filterValue */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPos(value: any | start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPos")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchProp(value: any | label | value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchProp")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(js.undefined)
        ret
    }
  }
  
}

