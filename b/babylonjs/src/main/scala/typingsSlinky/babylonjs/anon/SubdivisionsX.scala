package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubdivisionsX extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var subdivisions: js.UndefOr[Double] = js.native
  var subdivisionsX: js.UndefOr[Double] = js.native
  var subdivisionsY: js.UndefOr[Double] = js.native
  var updatable: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SubdivisionsX {
  @scala.inline
  def apply(): SubdivisionsX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubdivisionsX]
  }
  @scala.inline
  implicit class SubdivisionsXOps[Self <: SubdivisionsX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withSubdivisions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdivisionsX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisionsX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisionsX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisionsX")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdivisionsY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisionsY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisionsY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisionsY")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
  }
  
}

