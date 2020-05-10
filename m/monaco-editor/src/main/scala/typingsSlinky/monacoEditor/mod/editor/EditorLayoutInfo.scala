package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorLayoutInfo extends js.Object {
  /**
    * The height of the content (actual height)
    */
  val contentHeight: Double = js.native
  /**
    * Left position for the content (actual text)
    */
  val contentLeft: Double = js.native
  /**
    * The width of the content (actual text)
    */
  val contentWidth: Double = js.native
  /**
    * The height of the line decorations.
    */
  val decorationsHeight: Double = js.native
  /**
    * Left position for the line decorations.
    */
  val decorationsLeft: Double = js.native
  /**
    * The width of the line decorations.
    */
  val decorationsWidth: Double = js.native
  /**
    * The height of the glyph margin.
    */
  val glyphMarginHeight: Double = js.native
  /**
    * Left position for the glyph margin.
    */
  val glyphMarginLeft: Double = js.native
  /**
    * The width of the glyph margin.
    */
  val glyphMarginWidth: Double = js.native
  /**
    * Full editor height.
    */
  val height: Double = js.native
  /**
    * The height of the horizontal scrollbar.
    */
  val horizontalScrollbarHeight: Double = js.native
  /**
    * The height of the line numbers.
    */
  val lineNumbersHeight: Double = js.native
  /**
    * Left position for the line numbers.
    */
  val lineNumbersLeft: Double = js.native
  /**
    * The width of the line numbers.
    */
  val lineNumbersWidth: Double = js.native
  /**
    * The position for the minimap
    */
  val minimapLeft: Double = js.native
  /**
    * The width of the minimap
    */
  val minimapWidth: Double = js.native
  /**
    * The position of the overview ruler.
    */
  val overviewRuler: OverviewRulerPosition = js.native
  /**
    * Minimap render type
    */
  val renderMinimap: RenderMinimap = js.native
  /**
    * The width of the vertical scrollbar.
    */
  val verticalScrollbarWidth: Double = js.native
  /**
    * The number of columns (of typical characters) fitting on a viewport line.
    */
  val viewportColumn: Double = js.native
  /**
    * Full editor width.
    */
  val width: Double = js.native
}

object EditorLayoutInfo {
  @scala.inline
  def apply(
    contentHeight: Double,
    contentLeft: Double,
    contentWidth: Double,
    decorationsHeight: Double,
    decorationsLeft: Double,
    decorationsWidth: Double,
    glyphMarginHeight: Double,
    glyphMarginLeft: Double,
    glyphMarginWidth: Double,
    height: Double,
    horizontalScrollbarHeight: Double,
    lineNumbersHeight: Double,
    lineNumbersLeft: Double,
    lineNumbersWidth: Double,
    minimapLeft: Double,
    minimapWidth: Double,
    overviewRuler: OverviewRulerPosition,
    renderMinimap: RenderMinimap,
    verticalScrollbarWidth: Double,
    viewportColumn: Double,
    width: Double
  ): EditorLayoutInfo = {
    val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any], contentLeft = contentLeft.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], decorationsHeight = decorationsHeight.asInstanceOf[js.Any], decorationsLeft = decorationsLeft.asInstanceOf[js.Any], decorationsWidth = decorationsWidth.asInstanceOf[js.Any], glyphMarginHeight = glyphMarginHeight.asInstanceOf[js.Any], glyphMarginLeft = glyphMarginLeft.asInstanceOf[js.Any], glyphMarginWidth = glyphMarginWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontalScrollbarHeight = horizontalScrollbarHeight.asInstanceOf[js.Any], lineNumbersHeight = lineNumbersHeight.asInstanceOf[js.Any], lineNumbersLeft = lineNumbersLeft.asInstanceOf[js.Any], lineNumbersWidth = lineNumbersWidth.asInstanceOf[js.Any], minimapLeft = minimapLeft.asInstanceOf[js.Any], minimapWidth = minimapWidth.asInstanceOf[js.Any], overviewRuler = overviewRuler.asInstanceOf[js.Any], renderMinimap = renderMinimap.asInstanceOf[js.Any], verticalScrollbarWidth = verticalScrollbarWidth.asInstanceOf[js.Any], viewportColumn = viewportColumn.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorLayoutInfo]
  }
  @scala.inline
  implicit class EditorLayoutInfoOps[Self <: EditorLayoutInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorationsHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorationsHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorationsLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorationsLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorationsWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorationsWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphMarginHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphMarginWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalScrollbarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollbarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumbersHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumbersLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumbersWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimapLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimapLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimapWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimapWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverviewRuler(value: OverviewRulerPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderMinimap(value: RenderMinimap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMinimap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalScrollbarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollbarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

