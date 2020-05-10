package typingsSlinky.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPixelRatio extends js.Object {
  var pixelRatio: js.UndefOr[Double] = js.native
  var sdf: js.UndefOr[Boolean] = js.native
}

object AnonPixelRatio {
  @scala.inline
  def apply(): AnonPixelRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPixelRatio]
  }
  @scala.inline
  implicit class AnonPixelRatioOps[Self <: AnonPixelRatio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withSdf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdf")(js.undefined)
        ret
    }
  }
  
}

