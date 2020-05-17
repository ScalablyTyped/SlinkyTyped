package typingsSlinky.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelRatio extends js.Object {
  var pixelRatio: js.UndefOr[Double] = js.native
  var sdf: js.UndefOr[Boolean] = js.native
}

object PixelRatio {
  @scala.inline
  def apply(): PixelRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelRatio]
  }
  @scala.inline
  implicit class PixelRatioOps[Self <: PixelRatio] (val x: Self) extends AnyVal {
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

