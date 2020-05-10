package typingsSlinky.phosphorWidgets.dockpanelMod.DockPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the geometry for overlay positioning.
  */
@js.native
trait IOverlayGeometry extends js.Object {
  /**
    * The distance between the overlay and parent bottom edges.
    */
  var bottom: Double = js.native
  /**
    * The distance between the overlay and parent left edges.
    */
  var left: Double = js.native
  /**
    * The distance between the overlay and parent right edges.
    */
  var right: Double = js.native
  /**
    * The distance between the overlay and parent top edges.
    */
  var top: Double = js.native
}

object IOverlayGeometry {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): IOverlayGeometry = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayGeometry]
  }
  @scala.inline
  implicit class IOverlayGeometryOps[Self <: IOverlayGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

