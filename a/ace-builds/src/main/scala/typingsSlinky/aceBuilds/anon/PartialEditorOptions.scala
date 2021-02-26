package typingsSlinky.aceBuilds.anon

import typingsSlinky.aceBuilds.aceBuildsBooleans.`false`
import typingsSlinky.aceBuilds.aceBuildsBooleans.`true`
import typingsSlinky.aceBuilds.aceBuildsStrings.ace
import typingsSlinky.aceBuilds.aceBuildsStrings.always
import typingsSlinky.aceBuilds.aceBuildsStrings.auto
import typingsSlinky.aceBuilds.aceBuildsStrings.code
import typingsSlinky.aceBuilds.aceBuildsStrings.free
import typingsSlinky.aceBuilds.aceBuildsStrings.manual
import typingsSlinky.aceBuilds.aceBuildsStrings.markbegin
import typingsSlinky.aceBuilds.aceBuildsStrings.markbeginend
import typingsSlinky.aceBuilds.aceBuildsStrings.off
import typingsSlinky.aceBuilds.aceBuildsStrings.printmargin_
import typingsSlinky.aceBuilds.aceBuildsStrings.slim
import typingsSlinky.aceBuilds.aceBuildsStrings.smooth
import typingsSlinky.aceBuilds.aceBuildsStrings.text
import typingsSlinky.aceBuilds.aceBuildsStrings.wide
import typingsSlinky.aceBuilds.mod.Ace.EditSession
import typingsSlinky.aceBuilds.mod.Ace.NewLineMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ace-builds.ace-builds.Ace.EditorOptions> */
@js.native
trait PartialEditorOptions extends StObject {
  
  var animatedScroll: js.UndefOr[Boolean] = js.native
  
  var autoScrollEditorIntoView: js.UndefOr[Boolean] = js.native
  
  var behavioursEnabled: js.UndefOr[Boolean] = js.native
  
  var copyWithEmptySelection: js.UndefOr[Boolean] = js.native
  
  var cursorStyle: js.UndefOr[ace | slim | smooth | wide] = js.native
  
  var displayIndentGuides: js.UndefOr[Boolean] = js.native
  
  var dragDelay: js.UndefOr[Double] = js.native
  
  var dragEnabled: js.UndefOr[Boolean] = js.native
  
  var enableAutoIndent: js.UndefOr[Boolean] = js.native
  
  var fadeFoldWidgets: js.UndefOr[Boolean] = js.native
  
  var firstLineNumber: js.UndefOr[Double] = js.native
  
  var fixedWidthGutter: js.UndefOr[Boolean] = js.native
  
  var focusTimeout: js.UndefOr[Double] = js.native
  
  var foldStyle: js.UndefOr[markbegin | markbeginend | manual] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.native
  
  var hasCssTransforms: js.UndefOr[Boolean] = js.native
  
  var highlightActiveLine: js.UndefOr[Boolean] = js.native
  
  var highlightGutterLine: js.UndefOr[Boolean] = js.native
  
  var highlightSelectedWord: js.UndefOr[Boolean] = js.native
  
  var indentedSoftWrap: js.UndefOr[Boolean] = js.native
  
  var keyboardHandler: js.UndefOr[String] = js.native
  
  var maxLines: js.UndefOr[Double] = js.native
  
  var maxPixelHeight: js.UndefOr[Double] = js.native
  
  var mergeUndoDeltas: js.UndefOr[`true` | `false` | always] = js.native
  
  var minLines: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var navigateWithinSoftTabs: js.UndefOr[Boolean] = js.native
  
  var newLineMode: js.UndefOr[NewLineMode] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var printMargin: js.UndefOr[Boolean | Double] = js.native
  
  var printMarginColumn: js.UndefOr[Double] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  
  var scrollSpeed: js.UndefOr[Double] = js.native
  
  var selectionStyle: js.UndefOr[String] = js.native
  
  var session: js.UndefOr[EditSession] = js.native
  
  var showFoldWidgets: js.UndefOr[Boolean] = js.native
  
  var showGutter: js.UndefOr[Boolean] = js.native
  
  var showInvisibles: js.UndefOr[Boolean] = js.native
  
  var showLineNumbers: js.UndefOr[Boolean] = js.native
  
  var showPrintMargin: js.UndefOr[Boolean] = js.native
  
  var tabSize: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var tooltipFollowsMouse: js.UndefOr[Boolean] = js.native
  
  var useSoftTabs: js.UndefOr[Boolean] = js.native
  
  var useWorker: js.UndefOr[Boolean] = js.native
  
  var vScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var wrap: js.UndefOr[off | free | printmargin_ | Boolean | Double] = js.native
  
  var wrapBehavioursEnabled: js.UndefOr[Boolean] = js.native
  
  var wrapMethod: js.UndefOr[code | text | auto] = js.native
}
object PartialEditorOptions {
  
  @scala.inline
  def apply(): PartialEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditorOptions]
  }
  
  @scala.inline
  implicit class PartialEditorOptionsMutableBuilder[Self <: PartialEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimatedScroll(value: Boolean): Self = StObject.set(x, "animatedScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedScrollUndefined: Self = StObject.set(x, "animatedScroll", js.undefined)
    
    @scala.inline
    def setAutoScrollEditorIntoView(value: Boolean): Self = StObject.set(x, "autoScrollEditorIntoView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollEditorIntoViewUndefined: Self = StObject.set(x, "autoScrollEditorIntoView", js.undefined)
    
    @scala.inline
    def setBehavioursEnabled(value: Boolean): Self = StObject.set(x, "behavioursEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehavioursEnabledUndefined: Self = StObject.set(x, "behavioursEnabled", js.undefined)
    
    @scala.inline
    def setCopyWithEmptySelection(value: Boolean): Self = StObject.set(x, "copyWithEmptySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyWithEmptySelectionUndefined: Self = StObject.set(x, "copyWithEmptySelection", js.undefined)
    
    @scala.inline
    def setCursorStyle(value: ace | slim | smooth | wide): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    @scala.inline
    def setDisplayIndentGuides(value: Boolean): Self = StObject.set(x, "displayIndentGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIndentGuidesUndefined: Self = StObject.set(x, "displayIndentGuides", js.undefined)
    
    @scala.inline
    def setDragDelay(value: Double): Self = StObject.set(x, "dragDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDelayUndefined: Self = StObject.set(x, "dragDelay", js.undefined)
    
    @scala.inline
    def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
    
    @scala.inline
    def setEnableAutoIndent(value: Boolean): Self = StObject.set(x, "enableAutoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoIndentUndefined: Self = StObject.set(x, "enableAutoIndent", js.undefined)
    
    @scala.inline
    def setFadeFoldWidgets(value: Boolean): Self = StObject.set(x, "fadeFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeFoldWidgetsUndefined: Self = StObject.set(x, "fadeFoldWidgets", js.undefined)
    
    @scala.inline
    def setFirstLineNumber(value: Double): Self = StObject.set(x, "firstLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineNumberUndefined: Self = StObject.set(x, "firstLineNumber", js.undefined)
    
    @scala.inline
    def setFixedWidthGutter(value: Boolean): Self = StObject.set(x, "fixedWidthGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedWidthGutterUndefined: Self = StObject.set(x, "fixedWidthGutter", js.undefined)
    
    @scala.inline
    def setFocusTimeout(value: Double): Self = StObject.set(x, "focusTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusTimeoutUndefined: Self = StObject.set(x, "focusTimeout", js.undefined)
    
    @scala.inline
    def setFoldStyle(value: markbegin | markbeginend | manual): Self = StObject.set(x, "foldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldStyleUndefined: Self = StObject.set(x, "foldStyle", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setHScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "hScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHScrollBarAlwaysVisibleUndefined: Self = StObject.set(x, "hScrollBarAlwaysVisible", js.undefined)
    
    @scala.inline
    def setHasCssTransforms(value: Boolean): Self = StObject.set(x, "hasCssTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCssTransformsUndefined: Self = StObject.set(x, "hasCssTransforms", js.undefined)
    
    @scala.inline
    def setHighlightActiveLine(value: Boolean): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
    
    @scala.inline
    def setHighlightGutterLine(value: Boolean): Self = StObject.set(x, "highlightGutterLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightGutterLineUndefined: Self = StObject.set(x, "highlightGutterLine", js.undefined)
    
    @scala.inline
    def setHighlightSelectedWord(value: Boolean): Self = StObject.set(x, "highlightSelectedWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightSelectedWordUndefined: Self = StObject.set(x, "highlightSelectedWord", js.undefined)
    
    @scala.inline
    def setIndentedSoftWrap(value: Boolean): Self = StObject.set(x, "indentedSoftWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentedSoftWrapUndefined: Self = StObject.set(x, "indentedSoftWrap", js.undefined)
    
    @scala.inline
    def setKeyboardHandler(value: String): Self = StObject.set(x, "keyboardHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardHandlerUndefined: Self = StObject.set(x, "keyboardHandler", js.undefined)
    
    @scala.inline
    def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    @scala.inline
    def setMaxPixelHeight(value: Double): Self = StObject.set(x, "maxPixelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPixelHeightUndefined: Self = StObject.set(x, "maxPixelHeight", js.undefined)
    
    @scala.inline
    def setMergeUndoDeltas(value: `true` | `false` | always): Self = StObject.set(x, "mergeUndoDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeUndoDeltasUndefined: Self = StObject.set(x, "mergeUndoDeltas", js.undefined)
    
    @scala.inline
    def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNavigateWithinSoftTabs(value: Boolean): Self = StObject.set(x, "navigateWithinSoftTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigateWithinSoftTabsUndefined: Self = StObject.set(x, "navigateWithinSoftTabs", js.undefined)
    
    @scala.inline
    def setNewLineMode(value: NewLineMode): Self = StObject.set(x, "newLineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineModeUndefined: Self = StObject.set(x, "newLineMode", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPrintMargin(value: Boolean | Double): Self = StObject.set(x, "printMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintMarginColumn(value: Double): Self = StObject.set(x, "printMarginColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintMarginColumnUndefined: Self = StObject.set(x, "printMarginColumn", js.undefined)
    
    @scala.inline
    def setPrintMarginUndefined: Self = StObject.set(x, "printMargin", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPastEndUndefined: Self = StObject.set(x, "scrollPastEnd", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: String): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    
    @scala.inline
    def setSession(value: EditSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setShowFoldWidgets(value: Boolean): Self = StObject.set(x, "showFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFoldWidgetsUndefined: Self = StObject.set(x, "showFoldWidgets", js.undefined)
    
    @scala.inline
    def setShowGutter(value: Boolean): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
    
    @scala.inline
    def setShowInvisibles(value: Boolean): Self = StObject.set(x, "showInvisibles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInvisiblesUndefined: Self = StObject.set(x, "showInvisibles", js.undefined)
    
    @scala.inline
    def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLineNumbersUndefined: Self = StObject.set(x, "showLineNumbers", js.undefined)
    
    @scala.inline
    def setShowPrintMargin(value: Boolean): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTooltipFollowsMouse(value: Boolean): Self = StObject.set(x, "tooltipFollowsMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipFollowsMouseUndefined: Self = StObject.set(x, "tooltipFollowsMouse", js.undefined)
    
    @scala.inline
    def setUseSoftTabs(value: Boolean): Self = StObject.set(x, "useSoftTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSoftTabsUndefined: Self = StObject.set(x, "useSoftTabs", js.undefined)
    
    @scala.inline
    def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
    
    @scala.inline
    def setVScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "vScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVScrollBarAlwaysVisibleUndefined: Self = StObject.set(x, "vScrollBarAlwaysVisible", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWrap(value: off | free | printmargin_ | Boolean | Double): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapBehavioursEnabled(value: Boolean): Self = StObject.set(x, "wrapBehavioursEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapBehavioursEnabledUndefined: Self = StObject.set(x, "wrapBehavioursEnabled", js.undefined)
    
    @scala.inline
    def setWrapMethod(value: code | text | auto): Self = StObject.set(x, "wrapMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapMethodUndefined: Self = StObject.set(x, "wrapMethod", js.undefined)
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
