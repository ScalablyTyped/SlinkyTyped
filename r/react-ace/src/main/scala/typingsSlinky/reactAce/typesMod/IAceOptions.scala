package typingsSlinky.reactAce.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactAce.reactAceBooleans.`false`
import typingsSlinky.reactAce.reactAceBooleans.`true`
import typingsSlinky.reactAce.reactAceStrings.ace
import typingsSlinky.reactAce.reactAceStrings.always
import typingsSlinky.reactAce.reactAceStrings.line
import typingsSlinky.reactAce.reactAceStrings.slim
import typingsSlinky.reactAce.reactAceStrings.smooth
import typingsSlinky.reactAce.reactAceStrings.text
import typingsSlinky.reactAce.reactAceStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAceOptions
  extends /* index */ StringDictionary[js.Any] {
  var animatedScroll: js.UndefOr[Boolean] = js.native
  /** this is needed if editor is inside scrollable page */
  var autoScrollEditorIntoView: js.UndefOr[Boolean] = js.native
  var behavioursEnabled: js.UndefOr[Boolean] = js.native
  var cursorStyle: js.UndefOr[ace | slim | smooth | wide] = js.native
  var displayIndentGuides: js.UndefOr[Boolean] = js.native
  var dragDelay: js.UndefOr[Double] = js.native
  var dragEnabled: js.UndefOr[Boolean] = js.native
  var enableBasicAutocompletion: js.UndefOr[Boolean] = js.native
  var enableEmmet: js.UndefOr[Boolean] = js.native
  var enableLiveAutocompletion: js.UndefOr[Boolean] = js.native
  /** on by default */
  var enableMultiselect: js.UndefOr[Boolean] = js.native
  var enableSnippets: js.UndefOr[Boolean] = js.native
  var fadeFoldWidgets: js.UndefOr[Boolean] = js.native
  var firstLineNumber: js.UndefOr[Double] = js.native
  var fixedWidthGutter: js.UndefOr[Boolean] = js.native
  var focusTimout: js.UndefOr[Double] = js.native
  var foldStyle: js.UndefOr[Boolean] = js.native
  /** css */
  var fontFamily: js.UndefOr[String] = js.native
  /** number or css font-size string */
  var fontSize: js.UndefOr[Double | String] = js.native
  var hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.native
  var highlightActiveLine: js.UndefOr[Boolean] = js.native
  var highlightGutterLine: js.UndefOr[Boolean] = js.native
  var highlightSelectedWord: js.UndefOr[Boolean] = js.native
  var maxLines: js.UndefOr[Double] = js.native
  var mergeUndoDeltas: js.UndefOr[`false` | `true` | always] = js.native
  var minLines: js.UndefOr[Double] = js.native
  /** path to a mode e.g "ace/mode/text" */
  var mode: js.UndefOr[String] = js.native
  var newLineMode: js.UndefOr[Boolean] = js.native
  var overwrite: js.UndefOr[Boolean] = js.native
  var printMargin: js.UndefOr[Boolean] = js.native
  var printMarginColumn: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  var scrollSpeed: js.UndefOr[Double] = js.native
  var selectionStyle: js.UndefOr[line | text] = js.native
  var showFoldWidgets: js.UndefOr[Boolean] = js.native
  var showGutter: js.UndefOr[Boolean] = js.native
  var showInvisibles: js.UndefOr[Boolean] = js.native
  var showLineNumbers: js.UndefOr[Boolean] = js.native
  var showPrintMargin: js.UndefOr[Boolean] = js.native
  var spellcheck: js.UndefOr[Boolean] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  /** path to a theme e.g "ace/theme/textmate" */
  var theme: js.UndefOr[String] = js.native
  var tooltipFollowsMouse: js.UndefOr[Boolean] = js.native
  var useElasticTabstops: js.UndefOr[Boolean] = js.native
  var useSoftTabs: js.UndefOr[Boolean] = js.native
  var useWorker: js.UndefOr[Boolean] = js.native
  var vScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
  var wrapBehavioursEnabled: js.UndefOr[Boolean] = js.native
}

object IAceOptions {
  @scala.inline
  def apply(): IAceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAceOptions]
  }
  @scala.inline
  implicit class IAceOptionsOps[Self <: IAceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimatedScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimatedScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScrollEditorIntoView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollEditorIntoView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScrollEditorIntoView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollEditorIntoView")(js.undefined)
        ret
    }
    @scala.inline
    def withBehavioursEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavioursEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavioursEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavioursEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorStyle(value: ace | slim | smooth | wide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayIndentGuides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayIndentGuides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayIndentGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayIndentGuides")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBasicAutocompletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBasicAutocompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBasicAutocompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBasicAutocompletion")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableEmmet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEmmet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEmmet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEmmet")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLiveAutocompletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLiveAutocompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLiveAutocompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLiveAutocompletion")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMultiselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultiselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiselect")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSnippets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSnippets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSnippets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSnippets")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeFoldWidgets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeFoldWidgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeFoldWidgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeFoldWidgets")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLineNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedWidthGutter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWidthGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedWidthGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWidthGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusTimout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTimout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusTimout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTimout")(js.undefined)
        ret
    }
    @scala.inline
    def withFoldStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoldStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHScrollBarAlwaysVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hScrollBarAlwaysVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHScrollBarAlwaysVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hScrollBarAlwaysVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightActiveLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightActiveLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightActiveLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightActiveLine")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightGutterLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightGutterLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightGutterLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightGutterLine")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSelectedWord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSelectedWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedWord")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeUndoDeltas(value: `false` | `true` | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeUndoDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeUndoDeltas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeUndoDeltas")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNewLineMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewLineMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintMarginColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printMarginColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintMarginColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printMarginColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPastEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPastEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPastEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPastEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStyle(value: line | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFoldWidgets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFoldWidgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFoldWidgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFoldWidgets")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGutter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInvisibles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInvisibles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInvisibles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInvisibles")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLineNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLineNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLineNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPrintMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrintMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPrintMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrintMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipFollowsMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFollowsMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipFollowsMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFollowsMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withUseElasticTabstops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useElasticTabstops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseElasticTabstops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useElasticTabstops")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSoftTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSoftTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSoftTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSoftTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withVScrollBarAlwaysVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vScrollBarAlwaysVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVScrollBarAlwaysVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vScrollBarAlwaysVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapBehavioursEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapBehavioursEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapBehavioursEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapBehavioursEnabled")(js.undefined)
        ret
    }
  }
  
}

