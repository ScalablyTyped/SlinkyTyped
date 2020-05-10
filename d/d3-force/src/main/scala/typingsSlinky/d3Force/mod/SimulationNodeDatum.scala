package typingsSlinky.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationNodeDatum extends js.Object {
  /**
    * Node’s fixed x-position (if position was fixed)
    */
  var fx: js.UndefOr[Double | Null] = js.native
  /**
    * Node’s fixed y-position (if position was fixed)
    */
  var fy: js.UndefOr[Double | Null] = js.native
  /**
    * Node’s zero-based index into nodes array. This property is set during the initialization process of a simulation.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Node’s current x-velocity
    */
  var vx: js.UndefOr[Double] = js.native
  /**
    * Node’s current y-velocity
    */
  var vy: js.UndefOr[Double] = js.native
  /**
    * Node’s current x-position
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Node’s current y-position
    */
  var y: js.UndefOr[Double] = js.native
}

object SimulationNodeDatum {
  @scala.inline
  def apply(): SimulationNodeDatum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationNodeDatum]
  }
  @scala.inline
  implicit class SimulationNodeDatumOps[Self <: SimulationNodeDatum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(js.undefined)
        ret
    }
    @scala.inline
    def withFxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(null)
        ret
    }
    @scala.inline
    def withFy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fy")(js.undefined)
        ret
    }
    @scala.inline
    def withFyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fy")(null)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withVx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vx")(js.undefined)
        ret
    }
    @scala.inline
    def withVy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vy")(js.undefined)
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

