package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.all
import typingsSlinky.monacoEditor.monacoEditorStrings.boundary
import typingsSlinky.monacoEditor.monacoEditorStrings.gutter
import typingsSlinky.monacoEditor.monacoEditorStrings.line
import typingsSlinky.monacoEditor.monacoEditorStrings.none
import typingsSlinky.monacoEditor.monacoEditorStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalEditorViewOptions extends js.Object {
  val ariaLabel: String = js.native
  val cursorBlinking: TextEditorCursorBlinkingStyle = js.native
  val cursorSmoothCaretAnimation: Boolean = js.native
  val cursorStyle: TextEditorCursorStyle = js.native
  val cursorSurroundingLines: Double = js.native
  val cursorWidth: Double = js.native
  val disableMonospaceOptimizations: Boolean = js.native
  val extraEditorClassName: String = js.native
  val fixedOverflowWidgets: Boolean = js.native
  val fontLigatures: Boolean = js.native
  val glyphMargin: Boolean = js.native
  val hideCursorInOverviewRuler: Boolean = js.native
  val highlightActiveIndentGuide: Boolean = js.native
  val minimap: InternalEditorMinimapOptions = js.native
  val mouseWheelZoom: Boolean = js.native
  val overviewRulerBorder: Boolean = js.native
  val overviewRulerLanes: Double = js.native
  val renderControlCharacters: Boolean = js.native
  val renderCustomLineNumbers: (js.Function1[/* lineNumber */ Double, String]) | Null = js.native
  val renderFinalNewline: Boolean = js.native
  val renderIndentGuides: Boolean = js.native
  val renderLineHighlight: none | gutter | line | all = js.native
  val renderLineNumbers: RenderLineNumbersType = js.native
  val renderWhitespace: none | boundary | selection | all = js.native
  val revealHorizontalRightPadding: Double = js.native
  val roundedSelection: Boolean = js.native
  val rulers: js.Array[Double] = js.native
  val scrollBeyondLastColumn: Double = js.native
  val scrollBeyondLastLine: Boolean = js.native
  val scrollbar: InternalEditorScrollbarOptions = js.native
  val selectOnLineNumbers: Boolean = js.native
  val smoothScrolling: Boolean = js.native
  val stopRenderingLineAfter: Double = js.native
}

object InternalEditorViewOptions {
  @scala.inline
  def apply(
    ariaLabel: String,
    cursorBlinking: TextEditorCursorBlinkingStyle,
    cursorSmoothCaretAnimation: Boolean,
    cursorStyle: TextEditorCursorStyle,
    cursorSurroundingLines: Double,
    cursorWidth: Double,
    disableMonospaceOptimizations: Boolean,
    extraEditorClassName: String,
    fixedOverflowWidgets: Boolean,
    fontLigatures: Boolean,
    glyphMargin: Boolean,
    hideCursorInOverviewRuler: Boolean,
    highlightActiveIndentGuide: Boolean,
    minimap: InternalEditorMinimapOptions,
    mouseWheelZoom: Boolean,
    overviewRulerBorder: Boolean,
    overviewRulerLanes: Double,
    renderControlCharacters: Boolean,
    renderFinalNewline: Boolean,
    renderIndentGuides: Boolean,
    renderLineHighlight: none | gutter | line | all,
    renderLineNumbers: RenderLineNumbersType,
    renderWhitespace: none | boundary | selection | all,
    revealHorizontalRightPadding: Double,
    roundedSelection: Boolean,
    rulers: js.Array[Double],
    scrollBeyondLastColumn: Double,
    scrollBeyondLastLine: Boolean,
    scrollbar: InternalEditorScrollbarOptions,
    selectOnLineNumbers: Boolean,
    smoothScrolling: Boolean,
    stopRenderingLineAfter: Double
  ): InternalEditorViewOptions = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], cursorBlinking = cursorBlinking.asInstanceOf[js.Any], cursorSmoothCaretAnimation = cursorSmoothCaretAnimation.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorSurroundingLines = cursorSurroundingLines.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], disableMonospaceOptimizations = disableMonospaceOptimizations.asInstanceOf[js.Any], extraEditorClassName = extraEditorClassName.asInstanceOf[js.Any], fixedOverflowWidgets = fixedOverflowWidgets.asInstanceOf[js.Any], fontLigatures = fontLigatures.asInstanceOf[js.Any], glyphMargin = glyphMargin.asInstanceOf[js.Any], hideCursorInOverviewRuler = hideCursorInOverviewRuler.asInstanceOf[js.Any], highlightActiveIndentGuide = highlightActiveIndentGuide.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], mouseWheelZoom = mouseWheelZoom.asInstanceOf[js.Any], overviewRulerBorder = overviewRulerBorder.asInstanceOf[js.Any], overviewRulerLanes = overviewRulerLanes.asInstanceOf[js.Any], renderControlCharacters = renderControlCharacters.asInstanceOf[js.Any], renderFinalNewline = renderFinalNewline.asInstanceOf[js.Any], renderIndentGuides = renderIndentGuides.asInstanceOf[js.Any], renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderLineNumbers = renderLineNumbers.asInstanceOf[js.Any], renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding.asInstanceOf[js.Any], roundedSelection = roundedSelection.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], scrollBeyondLastColumn = scrollBeyondLastColumn.asInstanceOf[js.Any], scrollBeyondLastLine = scrollBeyondLastLine.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], selectOnLineNumbers = selectOnLineNumbers.asInstanceOf[js.Any], smoothScrolling = smoothScrolling.asInstanceOf[js.Any], stopRenderingLineAfter = stopRenderingLineAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEditorViewOptions]
  }
  @scala.inline
  implicit class InternalEditorViewOptionsOps[Self <: InternalEditorViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorBlinking(value: TextEditorCursorBlinkingStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlinking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorSmoothCaretAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorSmoothCaretAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorStyle(value: TextEditorCursorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorSurroundingLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableMonospaceOptimizations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMonospaceOptimizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraEditorClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraEditorClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedOverflowWidgets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedOverflowWidgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontLigatures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontLigatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideCursorInOverviewRuler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursorInOverviewRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightActiveIndentGuide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightActiveIndentGuide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimap(value: InternalEditorMinimapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseWheelZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverviewRulerBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverviewRulerLanes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerLanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderControlCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderControlCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderFinalNewline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFinalNewline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderIndentGuides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIndentGuides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderLineHighlight(value: none | gutter | line | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderLineNumbers(value: RenderLineNumbersType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderWhitespace(value: none | boundary | selection | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevealHorizontalRightPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealHorizontalRightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundedSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulers(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollBeyondLastColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollBeyondLastLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbar(value: InternalEditorScrollbarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectOnLineNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnLineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmoothScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopRenderingLineAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopRenderingLineAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderCustomLineNumbers(value: /* lineNumber */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCustomLineNumbers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderCustomLineNumbersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCustomLineNumbers")(null)
        ret
    }
  }
  
}

