package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphStyle extends js.Object {
  var alignment: js.UndefOr[String] = js.native
  var direction: js.UndefOr[String] = js.native
  var indentEnd: js.UndefOr[Dimension] = js.native
  var indentFirstLine: js.UndefOr[Dimension] = js.native
  var indentStart: js.UndefOr[Dimension] = js.native
  var lineSpacing: js.UndefOr[Double] = js.native
  var spaceAbove: js.UndefOr[Dimension] = js.native
  var spaceBelow: js.UndefOr[Dimension] = js.native
  var spacingMode: js.UndefOr[String] = js.native
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
  }
  
}

