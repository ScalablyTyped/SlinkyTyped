package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolOptionsObject extends js.Object {
  /**
    * The anchor X position for the `callout` symbol. This is where the chevron
    * points to.
    */
  var anchorX: js.UndefOr[Double] = js.native
  /**
    * The anchor Y position for the `callout` symbol. This is where the chevron
    * points to.
    */
  var anchorY: js.UndefOr[Double] = js.native
  /**
    * The end angle of an `arc` symbol.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Whether to draw `arc` symbol open or closed.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * The radius of an `arc` symbol, or the border radius for the `callout`
    * symbol.
    */
  var r: js.UndefOr[Double] = js.native
  /**
    * Whether to draw rounded edges.
    */
  var rounded: js.UndefOr[Boolean] = js.native
  /**
    * The start angle of an `arc` symbol.
    */
  var start: js.UndefOr[Double] = js.native
}

object SymbolOptionsObject {
  @scala.inline
  def apply(): SymbolOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolOptionsObject]
  }
  @scala.inline
  implicit class SymbolOptionsObjectOps[Self <: SymbolOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorX")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorY")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(js.undefined)
        ret
    }
    @scala.inline
    def withRounded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

