package typingsSlinky.antDesignReactNative.buttonStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonStyles extends js.Object {
  var container: ViewStyle = js.native
  var defaultDisabledRaw: ViewStyle = js.native
  var defaultDisabledRawText: TextStyle = js.native
  var defaultHighlight: ViewStyle = js.native
  var defaultHighlightText: TextStyle = js.native
  var defaultRaw: ViewStyle = js.native
  var defaultRawText: TextStyle = js.native
  var ghostDisabledRaw: ViewStyle = js.native
  var ghostDisabledRawText: TextStyle = js.native
  var ghostHighlight: ViewStyle = js.native
  var ghostHighlightText: TextStyle = js.native
  var ghostRaw: ViewStyle = js.native
  var ghostRawText: TextStyle = js.native
  var indicator: ViewStyle = js.native
  var largeRaw: ViewStyle = js.native
  var largeRawText: TextStyle = js.native
  var primaryDisabledRaw: ViewStyle = js.native
  var primaryDisabledRawText: TextStyle = js.native
  var primaryHighlight: ViewStyle = js.native
  var primaryHighlightText: TextStyle = js.native
  var primaryRaw: ViewStyle = js.native
  var primaryRawText: TextStyle = js.native
  var smallRaw: ViewStyle = js.native
  var smallRawText: TextStyle = js.native
  var warningDisabledRaw: ViewStyle = js.native
  var warningDisabledRawText: TextStyle = js.native
  var warningHighlight: ViewStyle = js.native
  var warningHighlightText: TextStyle = js.native
  var warningRaw: ViewStyle = js.native
  var warningRawText: TextStyle = js.native
  var wrapperStyle: ViewStyle = js.native
}

object ButtonStyles {
  @scala.inline
  def apply(
    container: ViewStyle,
    defaultDisabledRaw: ViewStyle,
    defaultDisabledRawText: TextStyle,
    defaultHighlight: ViewStyle,
    defaultHighlightText: TextStyle,
    defaultRaw: ViewStyle,
    defaultRawText: TextStyle,
    ghostDisabledRaw: ViewStyle,
    ghostDisabledRawText: TextStyle,
    ghostHighlight: ViewStyle,
    ghostHighlightText: TextStyle,
    ghostRaw: ViewStyle,
    ghostRawText: TextStyle,
    indicator: ViewStyle,
    largeRaw: ViewStyle,
    largeRawText: TextStyle,
    primaryDisabledRaw: ViewStyle,
    primaryDisabledRawText: TextStyle,
    primaryHighlight: ViewStyle,
    primaryHighlightText: TextStyle,
    primaryRaw: ViewStyle,
    primaryRawText: TextStyle,
    smallRaw: ViewStyle,
    smallRawText: TextStyle,
    warningDisabledRaw: ViewStyle,
    warningDisabledRawText: TextStyle,
    warningHighlight: ViewStyle,
    warningHighlightText: TextStyle,
    warningRaw: ViewStyle,
    warningRawText: TextStyle,
    wrapperStyle: ViewStyle
  ): ButtonStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], defaultDisabledRaw = defaultDisabledRaw.asInstanceOf[js.Any], defaultDisabledRawText = defaultDisabledRawText.asInstanceOf[js.Any], defaultHighlight = defaultHighlight.asInstanceOf[js.Any], defaultHighlightText = defaultHighlightText.asInstanceOf[js.Any], defaultRaw = defaultRaw.asInstanceOf[js.Any], defaultRawText = defaultRawText.asInstanceOf[js.Any], ghostDisabledRaw = ghostDisabledRaw.asInstanceOf[js.Any], ghostDisabledRawText = ghostDisabledRawText.asInstanceOf[js.Any], ghostHighlight = ghostHighlight.asInstanceOf[js.Any], ghostHighlightText = ghostHighlightText.asInstanceOf[js.Any], ghostRaw = ghostRaw.asInstanceOf[js.Any], ghostRawText = ghostRawText.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], largeRaw = largeRaw.asInstanceOf[js.Any], largeRawText = largeRawText.asInstanceOf[js.Any], primaryDisabledRaw = primaryDisabledRaw.asInstanceOf[js.Any], primaryDisabledRawText = primaryDisabledRawText.asInstanceOf[js.Any], primaryHighlight = primaryHighlight.asInstanceOf[js.Any], primaryHighlightText = primaryHighlightText.asInstanceOf[js.Any], primaryRaw = primaryRaw.asInstanceOf[js.Any], primaryRawText = primaryRawText.asInstanceOf[js.Any], smallRaw = smallRaw.asInstanceOf[js.Any], smallRawText = smallRawText.asInstanceOf[js.Any], warningDisabledRaw = warningDisabledRaw.asInstanceOf[js.Any], warningDisabledRawText = warningDisabledRawText.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningHighlightText = warningHighlightText.asInstanceOf[js.Any], warningRaw = warningRaw.asInstanceOf[js.Any], warningRawText = warningRawText.asInstanceOf[js.Any], wrapperStyle = wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyles]
  }
  @scala.inline
  implicit class ButtonStylesOps[Self <: ButtonStyles] (val x: Self) extends AnyVal {
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
    def withDefaultDisabledRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDisabledRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighlight(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighlightText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostDisabledRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostDisabledRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostHighlight(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostHighlightText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicator(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDisabledRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDisabledRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHighlight(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHighlightText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningDisabledRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningDisabledRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlight(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlightText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningRaw(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningRawText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

