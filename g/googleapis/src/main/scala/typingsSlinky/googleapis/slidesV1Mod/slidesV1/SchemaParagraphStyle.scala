package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles that apply to a whole paragraph.  If this text is contained in a
  * shape with a parent placeholder, then these paragraph styles may be
  * inherited from the parent. Which paragraph styles are inherited depend on
  * the nesting level of lists:  * A paragraph not in a list will inherit its
  * paragraph style from the   paragraph at the 0 nesting level of the list
  * inside the parent placeholder. * A paragraph in a list will inherit its
  * paragraph style from the paragraph   at its corresponding nesting level of
  * the list inside the parent   placeholder.  Inherited paragraph styles are
  * represented as unset fields in this message.
  */
@js.native
trait SchemaParagraphStyle extends js.Object {
  /**
    * The text alignment for this paragraph.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * The text direction of this paragraph. If unset, the value defaults to
    * LEFT_TO_RIGHT since text direction is not inherited.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The amount indentation for the paragraph on the side that corresponds to
    * the end of the text, based on the current text direction. If unset, the
    * value is inherited from the parent.
    */
  var indentEnd: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of indentation for the start of the first line of the
    * paragraph. If unset, the value is inherited from the parent.
    */
  var indentFirstLine: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount indentation for the paragraph on the side that corresponds to
    * the start of the text, based on the current text direction. If unset, the
    * value is inherited from the parent.
    */
  var indentStart: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of space between lines, as a percentage of normal, where
    * normal is represented as 100.0. If unset, the value is inherited from the
    * parent.
    */
  var lineSpacing: js.UndefOr[Double] = js.native
  /**
    * The amount of extra space above the paragraph. If unset, the value is
    * inherited from the parent.
    */
  var spaceAbove: js.UndefOr[SchemaDimension] = js.native
  /**
    * The amount of extra space below the paragraph. If unset, the value is
    * inherited from the parent.
    */
  var spaceBelow: js.UndefOr[SchemaDimension] = js.native
  /**
    * The spacing mode for the paragraph.
    */
  var spacingMode: js.UndefOr[String] = js.native
}

object SchemaParagraphStyle {
  @scala.inline
  def apply(): SchemaParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphStyle]
  }
  @scala.inline
  implicit class SchemaParagraphStyleOps[Self <: SchemaParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentEnd(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentFirstLine(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentFirstLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLine")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentStart(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStart")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceAbove(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAbove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceAbove")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceBelow(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBelow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBelow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBelow")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingMode")(js.undefined)
        ret
    }
  }
  
}

