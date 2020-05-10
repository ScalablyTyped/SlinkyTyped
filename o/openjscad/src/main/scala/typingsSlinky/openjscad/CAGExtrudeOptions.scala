package typingsSlinky.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CAGExtrudeOptions extends js.Object {
  var offset: js.UndefOr[js.Array[Double]] = js.native
  var twistangle: js.UndefOr[Double] = js.native
  var twiststeps: js.UndefOr[Double] = js.native
}

object CAGExtrudeOptions {
  @scala.inline
  def apply(): CAGExtrudeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CAGExtrudeOptions]
  }
  @scala.inline
  implicit class CAGExtrudeOptionsOps[Self <: CAGExtrudeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withTwistangle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twistangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwistangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twistangle")(js.undefined)
        ret
    }
    @scala.inline
    def withTwiststeps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twiststeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwiststeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twiststeps")(js.undefined)
        ret
    }
  }
  
}

