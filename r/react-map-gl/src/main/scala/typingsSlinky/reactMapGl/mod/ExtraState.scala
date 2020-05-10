package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraState extends js.Object {
  var inTransition: js.UndefOr[Boolean] = js.native
  var isDragging: js.UndefOr[Boolean] = js.native
  var isHovering: js.UndefOr[Boolean] = js.native
  var isPanning: js.UndefOr[Boolean] = js.native
  var isRotating: js.UndefOr[Boolean] = js.native
  var isZooming: js.UndefOr[Boolean] = js.native
}

object ExtraState {
  @scala.inline
  def apply(): ExtraState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraState]
  }
  @scala.inline
  implicit class ExtraStateOps[Self <: ExtraState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHovering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHovering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHovering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHovering")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPanning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPanning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPanning")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRotating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRotating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRotating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRotating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZooming")(js.undefined)
        ret
    }
  }
  
}

