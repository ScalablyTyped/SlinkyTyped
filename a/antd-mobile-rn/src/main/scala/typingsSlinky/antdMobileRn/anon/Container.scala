package typingsSlinky.antdMobileRn.anon

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var container: ViewStyle = js.native
  var defaultDisabledRaw: BorderColor = js.native
  var defaultDisabledRawText: ColorString = js.native
  var defaultHighlight: BorderColor = js.native
  var defaultHighlightText: ColorString = js.native
  var defaultRaw: BorderColor = js.native
  var defaultRawText: ColorString = js.native
  var ghostDisabledRaw: BorderColorString = js.native
  var ghostDisabledRawText: ColorString = js.native
  var ghostHighlight: BorderColor = js.native
  var ghostHighlightText: ColorString = js.native
  var ghostRaw: BorderColor = js.native
  var ghostRawText: ColorString = js.native
  var indicator: MarginRight = js.native
  var largeRaw: PaddingLeft = js.native
  var largeRawText: FontSizeNumber = js.native
  var primaryDisabledRaw: Opacity = js.native
  var primaryDisabledRawText: ColorString = js.native
  var primaryHighlight: BorderColor = js.native
  var primaryHighlightText: ColorString = js.native
  var primaryRaw: BorderColor = js.native
  var primaryRawText: ColorString = js.native
  var smallRaw: PaddingLeft = js.native
  var smallRawText: FontSizeNumber = js.native
  var warningDisabledRaw: Opacity = js.native
  var warningDisabledRawText: ColorString = js.native
  var warningHighlight: BorderColor = js.native
  var warningHighlightText: ColorString = js.native
  var warningRaw: BorderColor = js.native
  var warningRawText: ColorString = js.native
  var wrapperStyle: BorderWidth = js.native
}

object Container {
  @scala.inline
  def apply(
    container: ViewStyle,
    defaultDisabledRaw: BorderColor,
    defaultDisabledRawText: ColorString,
    defaultHighlight: BorderColor,
    defaultHighlightText: ColorString,
    defaultRaw: BorderColor,
    defaultRawText: ColorString,
    ghostDisabledRaw: BorderColorString,
    ghostDisabledRawText: ColorString,
    ghostHighlight: BorderColor,
    ghostHighlightText: ColorString,
    ghostRaw: BorderColor,
    ghostRawText: ColorString,
    indicator: MarginRight,
    largeRaw: PaddingLeft,
    largeRawText: FontSizeNumber,
    primaryDisabledRaw: Opacity,
    primaryDisabledRawText: ColorString,
    primaryHighlight: BorderColor,
    primaryHighlightText: ColorString,
    primaryRaw: BorderColor,
    primaryRawText: ColorString,
    smallRaw: PaddingLeft,
    smallRawText: FontSizeNumber,
    warningDisabledRaw: Opacity,
    warningDisabledRawText: ColorString,
    warningHighlight: BorderColor,
    warningHighlightText: ColorString,
    warningRaw: BorderColor,
    warningRawText: ColorString,
    wrapperStyle: BorderWidth
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], defaultDisabledRaw = defaultDisabledRaw.asInstanceOf[js.Any], defaultDisabledRawText = defaultDisabledRawText.asInstanceOf[js.Any], defaultHighlight = defaultHighlight.asInstanceOf[js.Any], defaultHighlightText = defaultHighlightText.asInstanceOf[js.Any], defaultRaw = defaultRaw.asInstanceOf[js.Any], defaultRawText = defaultRawText.asInstanceOf[js.Any], ghostDisabledRaw = ghostDisabledRaw.asInstanceOf[js.Any], ghostDisabledRawText = ghostDisabledRawText.asInstanceOf[js.Any], ghostHighlight = ghostHighlight.asInstanceOf[js.Any], ghostHighlightText = ghostHighlightText.asInstanceOf[js.Any], ghostRaw = ghostRaw.asInstanceOf[js.Any], ghostRawText = ghostRawText.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], largeRaw = largeRaw.asInstanceOf[js.Any], largeRawText = largeRawText.asInstanceOf[js.Any], primaryDisabledRaw = primaryDisabledRaw.asInstanceOf[js.Any], primaryDisabledRawText = primaryDisabledRawText.asInstanceOf[js.Any], primaryHighlight = primaryHighlight.asInstanceOf[js.Any], primaryHighlightText = primaryHighlightText.asInstanceOf[js.Any], primaryRaw = primaryRaw.asInstanceOf[js.Any], primaryRawText = primaryRawText.asInstanceOf[js.Any], smallRaw = smallRaw.asInstanceOf[js.Any], smallRawText = smallRawText.asInstanceOf[js.Any], warningDisabledRaw = warningDisabledRaw.asInstanceOf[js.Any], warningDisabledRawText = warningDisabledRawText.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningHighlightText = warningHighlightText.asInstanceOf[js.Any], warningRaw = warningRaw.asInstanceOf[js.Any], warningRawText = warningRawText.asInstanceOf[js.Any], wrapperStyle = wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDisabledRaw(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDisabledRawText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighlight(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighlightText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRaw(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRawText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostDisabledRaw(value: BorderColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostDisabledRawText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostHighlight(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostHighlightText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostRaw(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostRawText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicator(value: MarginRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeRaw(value: PaddingLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeRawText(value: FontSizeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDisabledRaw(value: Opacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDisabledRawText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHighlight(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHighlightText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRaw(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRawText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallRaw(value: PaddingLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallRawText(value: FontSizeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningDisabledRaw(value: Opacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningDisabledRawText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlight(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlightText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningRaw(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningRawText(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperStyle(value: BorderWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

