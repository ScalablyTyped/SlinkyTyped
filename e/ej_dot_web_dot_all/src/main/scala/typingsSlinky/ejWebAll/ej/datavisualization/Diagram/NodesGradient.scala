package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesGradient extends js.Object {
  /** Paints the node with linear color transitions
    */
  var LinearGradient: js.UndefOr[NodesGradientLinearGradient] = js.native
  /** Paints the node with radial color transitions. A focal point defines the beginning of the gradient, and a circle defines the end point of the gradient.
    */
  var RadialGradient: js.UndefOr[NodesGradientRadialGradient] = js.native
  /** Defines the color and a position where the previous color transition ends and a new color transition starts
    */
  var Stop: js.UndefOr[NodesGradientStop] = js.native
}

object NodesGradient {
  @scala.inline
  def apply(): NodesGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesGradient]
  }
  @scala.inline
  implicit class NodesGradientOps[Self <: NodesGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinearGradient(value: NodesGradientLinearGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinearGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinearGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialGradient(value: NodesGradientRadialGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadialGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadialGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: NodesGradientStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stop")(js.undefined)
        ret
    }
  }
  
}

