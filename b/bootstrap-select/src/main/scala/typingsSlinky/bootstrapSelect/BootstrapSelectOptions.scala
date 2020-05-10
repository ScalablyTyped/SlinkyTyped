package typingsSlinky.bootstrapSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSelectOptions extends js.Object {
  var actionsBox: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var countSelectedText: js.UndefOr[String | js.Function] = js.native
  var deselectAllText: js.UndefOr[String] = js.native
  var dropdownAlignRight: js.UndefOr[String | Boolean] = js.native
  var dropupAuto: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[String] = js.native
  var hideDisabled: js.UndefOr[Boolean] = js.native
  var iconBase: js.UndefOr[String] = js.native
  var liveSearch: js.UndefOr[Boolean] = js.native
  var liveSearchNormalize: js.UndefOr[Boolean] = js.native
  var liveSearchPlaceholder: js.UndefOr[String] = js.native
  var liveSearchStyle: js.UndefOr[String] = js.native
  var maxOptions: js.UndefOr[Double | Boolean] = js.native
  var maxOptionsText: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  var mobile: js.UndefOr[Boolean] = js.native
  var multipleSeparator: js.UndefOr[String] = js.native
  var noneSelectedText: js.UndefOr[String] = js.native
  var selectAllText: js.UndefOr[String] = js.native
  var selectOnTab: js.UndefOr[Boolean] = js.native
  var selectedTextFormat: js.UndefOr[String] = js.native
  var showContent: js.UndefOr[Boolean] = js.native
  var showIcon: js.UndefOr[Boolean] = js.native
  var showSubtext: js.UndefOr[Boolean] = js.native
  var showTick: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String | Double | Boolean] = js.native
  var style: js.UndefOr[String] = js.native
  var tickIcon: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var width: js.UndefOr[String | Boolean] = js.native
}

object BootstrapSelectOptions {
  @scala.inline
  def apply(): BootstrapSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapSelectOptions]
  }
  @scala.inline
  implicit class BootstrapSelectOptionsOps[Self <: BootstrapSelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionsBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsBox")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCountSelectedText(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countSelectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownAlignRight(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownAlignRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownAlignRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownAlignRight")(js.undefined)
        ret
    }
    @scala.inline
    def withDropupAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropupAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropupAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropupAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIconBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconBase")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveSearchNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearchNormalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSearchNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearchNormalize")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSearchPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearchPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveSearchStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearchStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSearchStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSearchStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOptions(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOptionsText(value: String | js.Array[_] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOptionsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOptionsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOptionsText")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withNoneSelectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noneSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoneSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noneSelectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnTab")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTextFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withShowContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSubtext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSubtext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSubtext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSubtext")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTick")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String | Double | Boolean): Self = {
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
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTickIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

