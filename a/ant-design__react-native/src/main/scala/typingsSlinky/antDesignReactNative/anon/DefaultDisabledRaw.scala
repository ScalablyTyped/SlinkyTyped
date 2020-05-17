package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultDisabledRaw extends js.Object {
  var container: RegisteredStyle[ViewStyle] = js.native
  var defaultDisabledRaw: RegisteredStyle[ViewStyle] = js.native
  var defaultDisabledRawText: RegisteredStyle[TextStyle] = js.native
  var defaultHighlight: RegisteredStyle[ViewStyle] = js.native
  var defaultHighlightText: RegisteredStyle[TextStyle] = js.native
  var defaultRaw: RegisteredStyle[ViewStyle] = js.native
  var defaultRawText: RegisteredStyle[TextStyle] = js.native
  var ghostDisabledRaw: RegisteredStyle[ViewStyle] = js.native
  var ghostDisabledRawText: RegisteredStyle[TextStyle] = js.native
  var ghostHighlight: RegisteredStyle[ViewStyle] = js.native
  var ghostHighlightText: RegisteredStyle[TextStyle] = js.native
  var ghostRaw: RegisteredStyle[ViewStyle] = js.native
  var ghostRawText: RegisteredStyle[TextStyle] = js.native
  var indicator: RegisteredStyle[ViewStyle] = js.native
  var largeRaw: RegisteredStyle[ViewStyle] = js.native
  var largeRawText: RegisteredStyle[TextStyle] = js.native
  var primaryDisabledRaw: RegisteredStyle[ViewStyle] = js.native
  var primaryDisabledRawText: RegisteredStyle[TextStyle] = js.native
  var primaryHighlight: RegisteredStyle[ViewStyle] = js.native
  var primaryHighlightText: RegisteredStyle[TextStyle] = js.native
  var primaryRaw: RegisteredStyle[ViewStyle] = js.native
  var primaryRawText: RegisteredStyle[TextStyle] = js.native
  var smallRaw: RegisteredStyle[ViewStyle] = js.native
  var smallRawText: RegisteredStyle[TextStyle] = js.native
  var warningDisabledRaw: RegisteredStyle[ViewStyle] = js.native
  var warningDisabledRawText: RegisteredStyle[TextStyle] = js.native
  var warningHighlight: RegisteredStyle[ViewStyle] = js.native
  var warningHighlightText: RegisteredStyle[TextStyle] = js.native
  var warningRaw: RegisteredStyle[ViewStyle] = js.native
  var warningRawText: RegisteredStyle[TextStyle] = js.native
  var wrapperStyle: RegisteredStyle[ViewStyle] = js.native
}

object DefaultDisabledRaw {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    defaultDisabledRaw: RegisteredStyle[ViewStyle],
    defaultDisabledRawText: RegisteredStyle[TextStyle],
    defaultHighlight: RegisteredStyle[ViewStyle],
    defaultHighlightText: RegisteredStyle[TextStyle],
    defaultRaw: RegisteredStyle[ViewStyle],
    defaultRawText: RegisteredStyle[TextStyle],
    ghostDisabledRaw: RegisteredStyle[ViewStyle],
    ghostDisabledRawText: RegisteredStyle[TextStyle],
    ghostHighlight: RegisteredStyle[ViewStyle],
    ghostHighlightText: RegisteredStyle[TextStyle],
    ghostRaw: RegisteredStyle[ViewStyle],
    ghostRawText: RegisteredStyle[TextStyle],
    indicator: RegisteredStyle[ViewStyle],
    largeRaw: RegisteredStyle[ViewStyle],
    largeRawText: RegisteredStyle[TextStyle],
    primaryDisabledRaw: RegisteredStyle[ViewStyle],
    primaryDisabledRawText: RegisteredStyle[TextStyle],
    primaryHighlight: RegisteredStyle[ViewStyle],
    primaryHighlightText: RegisteredStyle[TextStyle],
    primaryRaw: RegisteredStyle[ViewStyle],
    primaryRawText: RegisteredStyle[TextStyle],
    smallRaw: RegisteredStyle[ViewStyle],
    smallRawText: RegisteredStyle[TextStyle],
    warningDisabledRaw: RegisteredStyle[ViewStyle],
    warningDisabledRawText: RegisteredStyle[TextStyle],
    warningHighlight: RegisteredStyle[ViewStyle],
    warningHighlightText: RegisteredStyle[TextStyle],
    warningRaw: RegisteredStyle[ViewStyle],
    warningRawText: RegisteredStyle[TextStyle],
    wrapperStyle: RegisteredStyle[ViewStyle]
  ): DefaultDisabledRaw = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], defaultDisabledRaw = defaultDisabledRaw.asInstanceOf[js.Any], defaultDisabledRawText = defaultDisabledRawText.asInstanceOf[js.Any], defaultHighlight = defaultHighlight.asInstanceOf[js.Any], defaultHighlightText = defaultHighlightText.asInstanceOf[js.Any], defaultRaw = defaultRaw.asInstanceOf[js.Any], defaultRawText = defaultRawText.asInstanceOf[js.Any], ghostDisabledRaw = ghostDisabledRaw.asInstanceOf[js.Any], ghostDisabledRawText = ghostDisabledRawText.asInstanceOf[js.Any], ghostHighlight = ghostHighlight.asInstanceOf[js.Any], ghostHighlightText = ghostHighlightText.asInstanceOf[js.Any], ghostRaw = ghostRaw.asInstanceOf[js.Any], ghostRawText = ghostRawText.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], largeRaw = largeRaw.asInstanceOf[js.Any], largeRawText = largeRawText.asInstanceOf[js.Any], primaryDisabledRaw = primaryDisabledRaw.asInstanceOf[js.Any], primaryDisabledRawText = primaryDisabledRawText.asInstanceOf[js.Any], primaryHighlight = primaryHighlight.asInstanceOf[js.Any], primaryHighlightText = primaryHighlightText.asInstanceOf[js.Any], primaryRaw = primaryRaw.asInstanceOf[js.Any], primaryRawText = primaryRawText.asInstanceOf[js.Any], smallRaw = smallRaw.asInstanceOf[js.Any], smallRawText = smallRawText.asInstanceOf[js.Any], warningDisabledRaw = warningDisabledRaw.asInstanceOf[js.Any], warningDisabledRawText = warningDisabledRawText.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningHighlightText = warningHighlightText.asInstanceOf[js.Any], warningRaw = warningRaw.asInstanceOf[js.Any], warningRawText = warningRawText.asInstanceOf[js.Any], wrapperStyle = wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDisabledRaw]
  }
  @scala.inline
  implicit class DefaultDisabledRawOps[Self <: DefaultDisabledRaw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDisabledRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDisabledRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighlight(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHighlightText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostDisabledRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostDisabledRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostHighlight(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostHighlightText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicator(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDisabledRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDisabledRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHighlight(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHighlightText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningDisabledRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDisabledRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningDisabledRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDisabledRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlight(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlightText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningRaw(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningRawText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningRawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperStyle(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

