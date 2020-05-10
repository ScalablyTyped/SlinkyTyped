package typingsSlinky.reactFlexr.ReactFlexr

import typingsSlinky.react.mod.Props
import typingsSlinky.reactFlexr.reactFlexrStrings.bottom
import typingsSlinky.reactFlexr.reactFlexrStrings.center
import typingsSlinky.reactFlexr.reactFlexrStrings.left
import typingsSlinky.reactFlexr.reactFlexrStrings.right
import typingsSlinky.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps extends Props[Grid] {
  /**
    * Vertical Align Sub Cells: top, center, bottom
    */
  var align: js.UndefOr[top | center | bottom] = js.native
  /**
    * All sub cells will be full height.
    */
  var flexCells: js.UndefOr[Boolean] = js.native
  /**
    * Override default gutter: '1em', '5%', '10px', etc.
    * Propagates downwards. Cells inside this Grid component
    * will use the same gutter.
    */
  var gutter: js.UndefOr[String] = js.native
  /**
    * Horizontal Align Sub Cells: left, center, right
    */
  var hAlign: js.UndefOr[left | center | right] = js.native
}

object GridProps {
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: top | center | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexCells")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withHAlign(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hAlign")(js.undefined)
        ret
    }
  }
  
}

