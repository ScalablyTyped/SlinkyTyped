package typingsSlinky.phaser.Phaser.Types.Actions

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAlignConfig extends js.Object {
  /**
    * The height of the cell, in pixels, in which the item is positioned.
    */
  var cellHeight: js.UndefOr[integer] = js.native
  /**
    * The width of the cell, in pixels, in which the item is positioned.
    */
  var cellWidth: js.UndefOr[integer] = js.native
  /**
    * The height of the grid in items (not pixels). -1 means lay all items out vertically, regardless of quantity.
    *                                   If both this value and `width` are set to -1 then `width` overrides it and this value is ignored.
    */
  var height: js.UndefOr[integer] = js.native
  /**
    * The alignment position. One of the Phaser.Display.Align consts such as `TOP_LEFT` or `RIGHT_CENTER`.
    */
  var position: js.UndefOr[integer] = js.native
  /**
    * The width of the grid in items (not pixels). -1 means lay all items out horizontally, regardless of quantity.
    *                                  If both this value and height are set to -1 then this value overrides it and the `height` value is ignored.
    */
  var width: js.UndefOr[integer] = js.native
  /**
    * Optionally place the top-left of the final grid at this coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Optionally place the top-left of the final grid at this coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}

object GridAlignConfig {
  @scala.inline
  def apply(): GridAlignConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAlignConfig]
  }
  @scala.inline
  implicit class GridAlignConfigOps[Self <: GridAlignConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

