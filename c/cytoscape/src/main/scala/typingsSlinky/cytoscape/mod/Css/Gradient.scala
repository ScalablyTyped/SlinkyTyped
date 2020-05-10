package typingsSlinky.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties specify the gradient colouration of an edge's line:
  *
  * https://js.cytoscape.org/#style/gradient
  */
@js.native
trait Gradient extends js.Object {
  /**
    * The colours of the gradient stops.
    */
  var `line-gradient-stop-colours`: js.UndefOr[js.Array[PropertyValueEdge[Colour]]] = js.native
  /**
    * The positions of the gradient stops.
    * If not specified (or invalid), the stops will divide equally.
    */
  var `line-gradient-stop-positions`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.native
}

object Gradient {
  @scala.inline
  def apply(): Gradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gradient]
  }
  @scala.inline
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withLine-gradient-stop-colours`(value: js.Array[PropertyValueEdge[Colour]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient-stop-colours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gradient-stop-colours`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient-stop-colours")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-gradient-stop-positions`(value: js.Array[PropertyValueEdge[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient-stop-positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gradient-stop-positions`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient-stop-positions")(js.undefined)
        ret
    }
  }
  
}

