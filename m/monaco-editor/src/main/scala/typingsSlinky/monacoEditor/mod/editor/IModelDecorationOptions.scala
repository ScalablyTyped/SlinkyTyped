package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IMarkdownString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelDecorationOptions extends js.Object {
  /**
    * If set, the decoration will be rendered after the text with this CSS class name.
    */
  var afterContentClassName: js.UndefOr[String | Null] = js.native
  /**
    * If set, the decoration will be rendered before the text with this CSS class name.
    */
  var beforeContentClassName: js.UndefOr[String | Null] = js.native
  /**
    * CSS class name describing the decoration.
    */
  var className: js.UndefOr[String | Null] = js.native
  /**
    * If set, the decoration will be rendered in the glyph margin with this CSS class name.
    */
  var glyphMarginClassName: js.UndefOr[String | Null] = js.native
  /**
    * Message to be rendered when hovering over the glyph margin decoration.
    */
  var glyphMarginHoverMessage: js.UndefOr[IMarkdownString | js.Array[IMarkdownString] | Null] = js.native
  /**
    * Array of MarkdownString to render as the decoration message.
    */
  var hoverMessage: js.UndefOr[IMarkdownString | js.Array[IMarkdownString] | Null] = js.native
  /**
    * If set, the decoration will be rendered inline with the text with this CSS class name.
    * Please use this only for CSS rules that must impact the text. For example, use `className`
    * to have a background color decoration.
    */
  var inlineClassName: js.UndefOr[String | Null] = js.native
  /**
    * If there is an `inlineClassName` which affects letter spacing.
    */
  var inlineClassNameAffectsLetterSpacing: js.UndefOr[Boolean] = js.native
  /**
    * Should the decoration expand to encompass a whole line.
    */
  var isWholeLine: js.UndefOr[Boolean] = js.native
  /**
    * If set, the decoration will be rendered in the lines decorations with this CSS class name.
    */
  var linesDecorationsClassName: js.UndefOr[String | Null] = js.native
  /**
    * If set, the decoration will be rendered in the margin (covering its full width) with this CSS class name.
    */
  var marginClassName: js.UndefOr[String | Null] = js.native
  /**
    * If set, render this decoration in the minimap.
    */
  var minimap: js.UndefOr[IModelDecorationMinimapOptions | Null] = js.native
  /**
    * If set, render this decoration in the overview ruler.
    */
  var overviewRuler: js.UndefOr[IModelDecorationOverviewRulerOptions | Null] = js.native
  /**
    * Customize the growing behavior of the decoration when typing at the edges of the decoration.
    * Defaults to TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges
    */
  var stickiness: js.UndefOr[TrackedRangeStickiness] = js.native
  /**
    * Specifies the stack order of a decoration.
    * A decoration with greater stack order is always in front of a decoration with a lower stack order.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object IModelDecorationOptions {
  @scala.inline
  def apply(): IModelDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelDecorationOptions]
  }
  @scala.inline
  implicit class IModelDecorationOptionsOps[Self <: IModelDecorationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterContentClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterContentClassName")(null)
        ret
    }
    @scala.inline
    def withBeforeContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeContentClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContentClassName")(null)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(null)
        ret
    }
    @scala.inline
    def withGlyphMarginClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphMarginClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphMarginClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginClassName")(null)
        ret
    }
    @scala.inline
    def withGlyphMarginHoverMessage(value: IMarkdownString | js.Array[IMarkdownString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginHoverMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphMarginHoverMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginHoverMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphMarginHoverMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphMarginHoverMessage")(null)
        ret
    }
    @scala.inline
    def withHoverMessage(value: IMarkdownString | js.Array[IMarkdownString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMessage")(null)
        ret
    }
    @scala.inline
    def withInlineClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineClassName")(null)
        ret
    }
    @scala.inline
    def withInlineClassNameAffectsLetterSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineClassNameAffectsLetterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineClassNameAffectsLetterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineClassNameAffectsLetterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWholeLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWholeLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWholeLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWholeLine")(js.undefined)
        ret
    }
    @scala.inline
    def withLinesDecorationsClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesDecorationsClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinesDecorationsClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesDecorationsClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withLinesDecorationsClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesDecorationsClassName")(null)
        ret
    }
    @scala.inline
    def withMarginClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginClassName")(null)
        ret
    }
    @scala.inline
    def withMinimap(value: IModelDecorationMinimapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimap")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimap")(null)
        ret
    }
    @scala.inline
    def withOverviewRuler(value: IModelDecorationOverviewRulerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewRuler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRuler")(js.undefined)
        ret
    }
    @scala.inline
    def withOverviewRulerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRuler")(null)
        ret
    }
    @scala.inline
    def withStickiness(value: TrackedRangeStickiness): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickiness")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

