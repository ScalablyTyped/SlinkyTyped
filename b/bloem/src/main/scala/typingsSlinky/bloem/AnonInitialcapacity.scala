package typingsSlinky.bloem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInitialcapacity extends js.Object {
  var initial_capacity: js.UndefOr[Double] = js.native
  var ratio: js.UndefOr[Double] = js.native
  var scaling: js.UndefOr[Double] = js.native
}

object AnonInitialcapacity {
  @scala.inline
  def apply(): AnonInitialcapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInitialcapacity]
  }
  @scala.inline
  implicit class AnonInitialcapacityOps[Self <: AnonInitialcapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitial_capacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial_capacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withScaling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(js.undefined)
        ret
    }
  }
  
}

