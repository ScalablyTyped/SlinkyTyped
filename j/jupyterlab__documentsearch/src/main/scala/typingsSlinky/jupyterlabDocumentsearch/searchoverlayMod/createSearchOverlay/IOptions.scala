package typingsSlinky.jupyterlabDocumentsearch.searchoverlayMod.createSearchOverlay

import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.IDisplayState
import typingsSlinky.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance
import typingsSlinky.phosphorSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var isReadOnly: Boolean = js.native
  var onCaseSensitiveToggled: js.Function = js.native
  var onEndSearch: js.Function = js.native
  var onHighlightPrevious: js.Function = js.native
  var onHightlightNext: js.Function = js.native
  var onRegexToggled: js.Function = js.native
  var onReplaceAll: js.Function = js.native
  var onReplaceCurrent: js.Function = js.native
  var onStartQuery: js.Function = js.native
  var overlayState: IDisplayState = js.native
  var widgetChanged: Signal[SearchInstance, IDisplayState] = js.native
}

object IOptions {
  @scala.inline
  def apply(
    isReadOnly: Boolean,
    onCaseSensitiveToggled: js.Function,
    onEndSearch: js.Function,
    onHighlightPrevious: js.Function,
    onHightlightNext: js.Function,
    onRegexToggled: js.Function,
    onReplaceAll: js.Function,
    onReplaceCurrent: js.Function,
    onStartQuery: js.Function,
    overlayState: IDisplayState,
    widgetChanged: Signal[SearchInstance, IDisplayState]
  ): IOptions = {
    val __obj = js.Dynamic.literal(isReadOnly = isReadOnly.asInstanceOf[js.Any], onCaseSensitiveToggled = onCaseSensitiveToggled.asInstanceOf[js.Any], onEndSearch = onEndSearch.asInstanceOf[js.Any], onHighlightPrevious = onHighlightPrevious.asInstanceOf[js.Any], onHightlightNext = onHightlightNext.asInstanceOf[js.Any], onRegexToggled = onRegexToggled.asInstanceOf[js.Any], onReplaceAll = onReplaceAll.asInstanceOf[js.Any], onReplaceCurrent = onReplaceCurrent.asInstanceOf[js.Any], onStartQuery = onStartQuery.asInstanceOf[js.Any], overlayState = overlayState.asInstanceOf[js.Any], widgetChanged = widgetChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCaseSensitiveToggled(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaseSensitiveToggled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEndSearch(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnHighlightPrevious(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHighlightPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnHightlightNext(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHightlightNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRegexToggled(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegexToggled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReplaceAll(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReplaceAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReplaceCurrent(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReplaceCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnStartQuery(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayState(value: IDisplayState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetChanged(value: Signal[SearchInstance, IDisplayState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

