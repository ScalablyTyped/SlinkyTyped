package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphStyle extends js.Object {
  var alignment: js.UndefOr[String] = js.native
  var avoidWidowAndOrphan: js.UndefOr[Boolean] = js.native
  var borderBetween: js.UndefOr[ParagraphBorder] = js.native
  var borderBottom: js.UndefOr[ParagraphBorder] = js.native
  var borderLeft: js.UndefOr[ParagraphBorder] = js.native
  var borderRight: js.UndefOr[ParagraphBorder] = js.native
  var borderTop: js.UndefOr[ParagraphBorder] = js.native
  var direction: js.UndefOr[String] = js.native
  var headingId: js.UndefOr[String] = js.native
  var indentEnd: js.UndefOr[Dimension] = js.native
  var indentFirstLine: js.UndefOr[Dimension] = js.native
  var indentStart: js.UndefOr[Dimension] = js.native
  var keepLinesTogether: js.UndefOr[Boolean] = js.native
  var keepWithNext: js.UndefOr[Boolean] = js.native
  var lineSpacing: js.UndefOr[Double] = js.native
  var namedStyleType: js.UndefOr[String] = js.native
  var shading: js.UndefOr[Shading] = js.native
  var spaceAbove: js.UndefOr[Dimension] = js.native
  var spaceBelow: js.UndefOr[Dimension] = js.native
  var spacingMode: js.UndefOr[String] = js.native
  var tabStops: js.UndefOr[js.Array[TabStop]] = js.native
}

object ParagraphStyle {
  @scala.inline
  def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyle]
  }
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
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
    def withAvoidWidowAndOrphan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidWidowAndOrphan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidWidowAndOrphan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidWidowAndOrphan")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBetween(value: ParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBetween")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBetween")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottom(value: ParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeft(value: ParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRight(value: ParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTop(value: ParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(js.undefined)
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
    def withHeadingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingId")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentEnd(value: Dimension): Self = {
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
    def withIndentFirstLine(value: Dimension): Self = {
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
    def withIndentStart(value: Dimension): Self = {
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
    def withKeepLinesTogether(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLinesTogether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLinesTogether: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLinesTogether")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepWithNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepWithNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithNext")(js.undefined)
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
    def withNamedStyleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedStyleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleType")(js.undefined)
        ret
    }
    @scala.inline
    def withShading(value: Shading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceAbove(value: Dimension): Self = {
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
    def withSpaceBelow(value: Dimension): Self = {
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
    @scala.inline
    def withTabStops(value: js.Array[TabStop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStops")(js.undefined)
        ret
    }
  }
  
}

