package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.CENTER
import typingsSlinky.figma.figmaStrings.COLUMNS
import typingsSlinky.figma.figmaStrings.MAX
import typingsSlinky.figma.figmaStrings.MIN
import typingsSlinky.figma.figmaStrings.ROWS
import typingsSlinky.figma.figmaStrings.STRETCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowsColsLayoutGrid extends LayoutGrid {
  val alignment: MIN | MAX | STRETCH | CENTER = js.native
  val color: js.UndefOr[RGBA] = js.native
  val count: Double = js.native
  val gutterSize: Double = js.native
   // Not set for alignment: "STRETCH"
  val offset: js.UndefOr[Double] = js.native
  val pattern: ROWS | COLUMNS = js.native
   // Infinity when "Auto" is set in the UI
  val sectionSize: js.UndefOr[Double] = js.native
   // Not set for alignment: "CENTER"
  val visible: js.UndefOr[Boolean] = js.native
}

object RowsColsLayoutGrid {
  @scala.inline
  def apply(
    alignment: MIN | MAX | STRETCH | CENTER,
    count: Double,
    gutterSize: Double,
    pattern: ROWS | COLUMNS
  ): RowsColsLayoutGrid = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gutterSize = gutterSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsColsLayoutGrid]
  }
  @scala.inline
  implicit class RowsColsLayoutGridOps[Self <: RowsColsLayoutGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: MIN | MAX | STRETCH | CENTER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGutterSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: ROWS | COLUMNS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: RGBA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

