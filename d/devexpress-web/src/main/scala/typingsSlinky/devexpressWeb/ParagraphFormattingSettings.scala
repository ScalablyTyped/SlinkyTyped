package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains paragraph formatting settings.
  */
@js.native
trait ParagraphFormattingSettings extends js.Object {
  /**
    * Specifies the paragraph alignment.
    */
  var alignment: ParagraphAlignment = js.native
  /**
    * Specifies the paragraph background color.
    */
  var backColor: String = js.native
  /**
    * Specifies whether to remove an additional space (contextual spacing) between paragraphs of the same style.
    */
  var contextualSpacing: Boolean = js.native
  /**
    * Specifies the indent of the paragraph's first line.
    */
  var firstLineIndent: Double = js.native
  /**
    * Specifies whether and how the paragraph's first line is indented.
    */
  var firstLineIndentType: ParagraphFirstLineIndent = js.native
  /**
    * Specifies whether all lines in a paragraph should appear on the same page.
    */
  var keepLinesTogether: Boolean = js.native
  /**
    * Specifies the left indent for text in a paragraph.
    */
  var leftIndent: Double = js.native
  /**
    * Specifies a line spacing value.
    */
  var lineSpacing: Double = js.native
  /**
    * Specifies a spacing between lines in the paragraph.
    */
  var lineSpacingType: ParagraphLineSpacingType = js.native
  /**
    * Specifies the paragraph's outline level.
    */
  var outlineLevel: Double = js.native
  /**
    * Specifies whether a page break is inserted before the paragraph.
    */
  var pageBreakBefore: Boolean = js.native
  /**
    * Specifies the paragraph's right indent.
    */
  var rightIndent: Double = js.native
  /**
    * Specifies the spacing after the paragraph.
    */
  var spacingAfter: Double = js.native
  /**
    * Specifies the spacing before the paragraph.
    */
  var spacingBefore: Double = js.native
}

object ParagraphFormattingSettings {
  @scala.inline
  def apply(
    alignment: ParagraphAlignment,
    backColor: String,
    contextualSpacing: Boolean,
    firstLineIndent: Double,
    firstLineIndentType: ParagraphFirstLineIndent,
    keepLinesTogether: Boolean,
    leftIndent: Double,
    lineSpacing: Double,
    lineSpacingType: ParagraphLineSpacingType,
    outlineLevel: Double,
    pageBreakBefore: Boolean,
    rightIndent: Double,
    spacingAfter: Double,
    spacingBefore: Double
  ): ParagraphFormattingSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], backColor = backColor.asInstanceOf[js.Any], contextualSpacing = contextualSpacing.asInstanceOf[js.Any], firstLineIndent = firstLineIndent.asInstanceOf[js.Any], firstLineIndentType = firstLineIndentType.asInstanceOf[js.Any], keepLinesTogether = keepLinesTogether.asInstanceOf[js.Any], leftIndent = leftIndent.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineSpacingType = lineSpacingType.asInstanceOf[js.Any], outlineLevel = outlineLevel.asInstanceOf[js.Any], pageBreakBefore = pageBreakBefore.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], spacingAfter = spacingAfter.asInstanceOf[js.Any], spacingBefore = spacingBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormattingSettings]
  }
  @scala.inline
  implicit class ParagraphFormattingSettingsOps[Self <: ParagraphFormattingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: ParagraphAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextualSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLineIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLineIndentType(value: ParagraphFirstLineIndent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineIndentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepLinesTogether(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLinesTogether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineSpacingType(value: ParagraphLineSpacingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageBreakBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacingAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacingBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingBefore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

