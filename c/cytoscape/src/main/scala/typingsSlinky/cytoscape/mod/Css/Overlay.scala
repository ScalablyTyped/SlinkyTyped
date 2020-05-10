package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties allow for the creation of overlays on top of nodes or edges,
  * and are often used in the :active state.
  * http://js.cytoscape.org/#style/overlay
  */
@js.native
trait Overlay extends js.Object {
  /**
    * The colour of the overlay.
    */
  var `overlay-color`: PropertyValueEdge[Colour] = js.native
  /**
    * The opacity of the overlay.
    */
  var `overlay-opacity`: PropertyValueEdge[Double] = js.native
  /**
    * The area outside of the element within which the overlay is shown.
    */
  var `overlay-padding`: PropertyValueEdge[Double | String] = js.native
}

object Overlay {
  @scala.inline
  def apply(
    `overlay-color`: PropertyValueEdge[Colour],
    `overlay-opacity`: PropertyValueEdge[Double],
    `overlay-padding`: PropertyValueEdge[Double | String]
  ): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overlay-color")(`overlay-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("overlay-opacity")(`overlay-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("overlay-padding")(`overlay-padding`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-color`(value: PropertyValueEdge[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-opacity`(value: PropertyValueEdge[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-padding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay-padding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

