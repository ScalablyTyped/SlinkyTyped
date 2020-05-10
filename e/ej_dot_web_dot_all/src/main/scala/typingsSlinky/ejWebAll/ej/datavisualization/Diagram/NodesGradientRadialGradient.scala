package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesGradientRadialGradient extends js.Object {
  /** Defines the position of the outermost circle
    * @Default {0}
    */
  var cx: js.UndefOr[Double] = js.native
  /** Defines the outer most circle of the radial gradient
    * @Default {0}
    */
  var cy: js.UndefOr[Double] = js.native
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fx: js.UndefOr[Double] = js.native
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fy: js.UndefOr[Double] = js.native
  /** Defines the different colors and the region of color transitions.
    * @Default {[]}
    */
  var stops: js.UndefOr[js.Array[_]] = js.native
  /** Defines the type of gradient
    * @Default {radial}
    */
  var `type`: js.UndefOr[String] = js.native
}

object NodesGradientRadialGradient {
  @scala.inline
  def apply(): NodesGradientRadialGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesGradientRadialGradient]
  }
  @scala.inline
  implicit class NodesGradientRadialGradientOps[Self <: NodesGradientRadialGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(js.undefined)
        ret
    }
    @scala.inline
    def withCy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(js.undefined)
        ret
    }
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
    def withStops(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

