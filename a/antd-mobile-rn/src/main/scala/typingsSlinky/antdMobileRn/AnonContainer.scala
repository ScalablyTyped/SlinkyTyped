package typingsSlinky.antdMobileRn

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainer extends js.Object {
  var container: ViewStyle = js.native
  var defaultDisabledRaw: AnonBorderColor = js.native
  var defaultDisabledRawText: AnonColorString = js.native
  var defaultHighlight: AnonBorderColor = js.native
  var defaultHighlightText: AnonColorString = js.native
  var defaultRaw: AnonBorderColor = js.native
  var defaultRawText: AnonColorString = js.native
  var ghostDisabledRaw: AnonBorderColorString = js.native
  var ghostDisabledRawText: AnonColorString = js.native
  var ghostHighlight: AnonBorderColor = js.native
  var ghostHighlightText: AnonColorString = js.native
  var ghostRaw: AnonBorderColor = js.native
  var ghostRawText: AnonColorString = js.native
  var indicator: AnonMarginRight = js.native
  var largeRaw: AnonPaddingLeft = js.native
  var largeRawText: AnonFontSizeNumber = js.native
  var primaryDisabledRaw: AnonOpacity = js.native
  var primaryDisabledRawText: AnonColorString = js.native
  var primaryHighlight: AnonBorderColor = js.native
  var primaryHighlightText: AnonColorString = js.native
  var primaryRaw: AnonBorderColor = js.native
  var primaryRawText: AnonColorString = js.native
  var smallRaw: AnonPaddingLeft = js.native
  var smallRawText: AnonFontSizeNumber = js.native
  var warningDisabledRaw: AnonOpacity = js.native
  var warningDisabledRawText: AnonColorString = js.native
  var warningHighlight: AnonBorderColor = js.native
  var warningHighlightText: AnonColorString = js.native
  var warningRaw: AnonBorderColor = js.native
  var warningRawText: AnonColorString = js.native
  var wrapperStyle: AnonBorderWidth = js.native
}

object AnonContainer {
  @scala.inline
  def apply(
    container: ViewStyle,
    defaultDisabledRaw: AnonBorderColor,
    defaultDisabledRawText: AnonColorString,
    defaultHighlight: AnonBorderColor,
    defaultHighlightText: AnonColorString,
    defaultRaw: AnonBorderColor,
    defaultRawText: AnonColorString,
    ghostDisabledRaw: AnonBorderColorString,
    ghostDisabledRawText: AnonColorString,
    ghostHighlight: AnonBorderColor,
    ghostHighlightText: AnonColorString,
    ghostRaw: AnonBorderColor,
    ghostRawText: AnonColorString,
    indicator: AnonMarginRight,
    largeRaw: AnonPaddingLeft,
    largeRawText: AnonFontSizeNumber,
    primaryDisabledRaw: AnonOpacity,
    primaryDisabledRawText: AnonColorString,
    primaryHighlight: AnonBorderColor,
    primaryHighlightText: AnonColorString,
    primaryRaw: AnonBorderColor,
    primaryRawText: AnonColorString,
    smallRaw: AnonPaddingLeft,
    smallRawText: AnonFontSizeNumber,
    warningDisabledRaw: AnonOpacity,
    warningDisabledRawText: AnonColorString,
    warningHighlight: AnonBorderColor,
    warningHighlightText: AnonColorString,
    warningRaw: AnonBorderColor,
    warningRawText: AnonColorString,
    wrapperStyle: AnonBorderWidth
  ): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], defaultDisabledRaw = defaultDisabledRaw.asInstanceOf[js.Any], defaultDisabledRawText = defaultDisabledRawText.asInstanceOf[js.Any], defaultHighlight = defaultHighlight.asInstanceOf[js.Any], defaultHighlightText = defaultHighlightText.asInstanceOf[js.Any], defaultRaw = defaultRaw.asInstanceOf[js.Any], defaultRawText = defaultRawText.asInstanceOf[js.Any], ghostDisabledRaw = ghostDisabledRaw.asInstanceOf[js.Any], ghostDisabledRawText = ghostDisabledRawText.asInstanceOf[js.Any], ghostHighlight = ghostHighlight.asInstanceOf[js.Any], ghostHighlightText = ghostHighlightText.asInstanceOf[js.Any], ghostRaw = ghostRaw.asInstanceOf[js.Any], ghostRawText = ghostRawText.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], largeRaw = largeRaw.asInstanceOf[js.Any], largeRawText = largeRawText.asInstanceOf[js.Any], primaryDisabledRaw = primaryDisabledRaw.asInstanceOf[js.Any], primaryDisabledRawText = primaryDisabledRawText.asInstanceOf[js.Any], primaryHighlight = primaryHighlight.asInstanceOf[js.Any], primaryHighlightText = primaryHighlightText.asInstanceOf[js.Any], primaryRaw = primaryRaw.asInstanceOf[js.Any], primaryRawText = primaryRawText.asInstanceOf[js.Any], smallRaw = smallRaw.asInstanceOf[js.Any], smallRawText = smallRawText.asInstanceOf[js.Any], warningDisabledRaw = warningDisabledRaw.asInstanceOf[js.Any], warningDisabledRawText = warningDisabledRawText.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningHighlightText = warningHighlightText.asInstanceOf[js.Any], warningRaw = warningRaw.asInstanceOf[js.Any], warningRawText = warningRawText.asInstanceOf[js.Any], wrapperStyle = wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
  @scala.inline
  implicit class AnonContainerOps[Self <: AnonContainer] (val x: Self) extends AnyVal {
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
    def withDefaultDisabledRaw(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDisabledRawText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighlight(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighlightText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRaw(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRawText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostDisabledRaw(value: AnonBorderColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostDisabledRawText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostHighlight(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostHighlightText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostRaw(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostRawText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicator(value: AnonMarginRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeRaw(value: AnonPaddingLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeRawText(value: AnonFontSizeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDisabledRaw(value: AnonOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDisabledRawText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHighlight(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHighlightText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRaw(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRawText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallRaw(value: AnonPaddingLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallRawText(value: AnonFontSizeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningDisabledRaw(value: AnonOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningDisabledRawText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlight(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlightText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningRaw(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningRawText(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperStyle(value: AnonBorderWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

