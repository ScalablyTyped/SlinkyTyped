package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.GRID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridLayoutGrid extends LayoutGrid {
  val color: js.UndefOr[RGBA] = js.native
  val pattern: GRID = js.native
  val sectionSize: Double = js.native
  val visible: js.UndefOr[Boolean] = js.native
}

object GridLayoutGrid {
  @scala.inline
  def apply(pattern: GRID, sectionSize: Double): GridLayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayoutGrid]
  }
  @scala.inline
  implicit class GridLayoutGridOps[Self <: GridLayoutGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPattern(value: GRID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionSize")(value.asInstanceOf[js.Any])
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

